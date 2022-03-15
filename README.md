# DronesWiki
Sample Spring application for CRUD operations on drone DB

Mysql is a container that should be running inorder to run the application.

How to run:
1. git clone https://github.com/portkey2112/DronesWiki.git
2. git checkout devops
3. cd drones-spring
4. docker-compose up 

Running the docker compose file will create the image for the app and run the container. 


How to run (from kind cluster):
1. docker build -t drone-details:v1 .
2. kind load docker-image drone-details:v1
3. helm install -f drone-chart/values.yaml drone-helm-app drone-chart
4. kubectl get pods  (Copy the application pod name)
5. kubectl port-forward <pod-name> 8080:8080
Open a browser and run http://localhost:8080/droneModels 


