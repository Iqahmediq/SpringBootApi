## springboot
lancer xampp   
telecharger zip 
decompresser 
create database in phpmyadmin "dbemployee"   
ouvrir le fichier.jar double clic ou ouvrir le terminal dans le dossier target  
et executer
```shell
java -jar GestionEmploiDepartement-0.0.1-SNAPSHOT.jar
```
## How to use
RQ:  
you have to start with create departement  
# departement  
  
//ajout department  
//post   
http://localhost:8082/api/departments  
{  
"departmentName": "Service Clientel"  
}  
  
    
//voirs tout les departments  
//get  
http://localhost:8082/api/dali 
  
    
      
//voir department by id   
//get   
http://localhost:8082/api/departments/1 
  
   
//modifier department by id   
//put     
http://localhost:8082/api/departments/1  
{  
  "departmentName":"testupdate"  
}  
  
   
# employee
//ajout employee    
//post   
http://localhost:8082/api/employees //post  
{   
"departmentId": 1,  
"employeeFirstName": "test",  
"employeeLastName": "test",  
"employeePhoneNumber": "12345678"   
}    
  
    
//effacer employee      
//delete    
http://localhost:8082/api/employees/1

//voir tout les employees   
//get    
http://localhost:8082/api/employees  
  
//voir les employees by id    
//get    
  http://localhost:8082/api/employees/1
  
  
  //modifier les employee avec id   
//put  
  http://localhost:8082/api/employees/1  
  {  
  "departmentId":1,  
  "employeeFirstName":"testupdate",  
  "employeeLastName":"ok1",  
  "employeePhoneNumber":"55555"  
}  
