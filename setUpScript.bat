echo off
set setup=%1
set hasErrors=0
if /I "%setup%"=="recievables" (

cd finnaxia-projects\finnaxia-ejb
IF %hasErrors%==0 call mvn clean compile install -DskipTests install || set hasErrors=1
IF %hasErrors%==0 call mvn eclipse:eclipse || set hasErrors=1

cd ..
cd finnaxia-mediator
IF %hasErrors%==0 call mvn clean compile install -DskipTests install || set hasErrors=1
IF %hasErrors%==0 call mvn eclipse:eclipse || set hasErrors=1

cd ..
cd finnaxia-web\finnaxia-tbs-web\finnaxia-common-web
IF %hasErrors%==0 call mvn clean compile install -DskipTests install || set hasErrors=1
IF %hasErrors%==0 call mvn eclipse:eclipse || set hasErrors=1


cd ..
cd finnaxia-core-web
IF %hasErrors%==0 call mvn clean compile install -DskipTests install || set hasErrors=1
IF %hasErrors%==0 call mvn eclipse:eclipse || set hasErrors=1

cd ..
cd finnaxia-receivables-web
IF %hasErrors%==0 call mvn clean compile install -DskipTests install || set hasErrors=1
IF %hasErrors%==0 call mvn eclipse:eclipse || set hasErrors=1

cd ..
cd ..
cd ..
cd ..
IF %hasErrors%==1 goto :error


)

if /I "%setup%"=="payments" (

)
if /I "%setup%"=="all" (

)
exit
:error
@echo setup=failed > test.properties
exit