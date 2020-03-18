# SpingbootConfigMaps

In this repository, we will:

## Create two Rest Services using Spring Boot
  * IntegrationLayer
  * ProcessLayer
 
## Message Flow:
 * ProcessLayer invokes Integration Layer
 
 REST (HTTP GET) -> ProcessLayer -> REST (HTTP GET) -> Integration Layer
 
## Create Docker images
 
## Deploy in Kubernetes using ConfigMaps
 * Look in the Kubernetes folders to see the yml files for creating deployment, service & configmap objects in kubernetes
