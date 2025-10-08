# <ins>  microservice-learning </ins> 


## Day 5 docker postgres use Dockerfile to build postgrest container
 - add Dockerfile: ()
 - build images and provide image name: docker build . -t postgres_db10
 - then run docker image and provide port : docker run -p 5433:5432 -> (out:in)
 - setup postgres that provide in Dockerfile to pgadmin
 - run spring boot application to generates table

## Day 6 docker-compose.yml file to build many images 
 - add service like(postgres, pgadmin) or your service from you project like account_service1
 - provide image to service like (postgres and pgadmin) that get from dockerhug
 - provide env and port, if not use default 
 - service from your project should be provide only port
 - make sure you have to build your image from your project to point to database in this docker-compose file

## Day 7 config server with classpath
 - init new project with Spring cloud config dependancy
 - add @EnableConfigServer in application class
 - add folder to store properties configuration file
 - set up the application.propertie for (default,dev or product) or for other service (account, card, loan)
