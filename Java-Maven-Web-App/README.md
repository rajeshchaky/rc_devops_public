this project involves pipline like below

Git checkout of Java web app code

Maven Cobertura compilation

maven clean install or test

maven package it into a war

create a docker image with tomcat as image and open port 80

build the war file using docker into that tomcat image and upload that image to dockerhub

use the ansible playbook to deploy the image from dockerhub into a host system

install all the necessary softwares and deploy that as a container

verify the deployment in the port 80

