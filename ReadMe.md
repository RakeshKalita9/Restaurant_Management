<h1 style="color:blue;text-align:center;" ><b>Restaurant_Management-System</h1>
<h1 style="color:blue;" ><b>Data Structures and Framework used</h1>
<p>Data Structure --> Array List</p>
<p>Framework --> SpringBoot</p>
<p>Language --> Java</p>
<h1 style="color:blue;" ><b>Data Flow</h1>
1.controller --> Controller Package handels all type of Api request by RestaurantController Class.
<br>
<br>
2.Service --> Service Layer Contains the entity class as Model Class names as Restaurant class and all the Business Logic of our code is writeen inside the RestaurantService Class.
<br>
<br>
3. Repository --> Inside the Repo package we have a RestaurantRepo class and inside the Class we have a ArrayList of type Restaurant as our dataSource
<br>
<br>
<h1 style="color:blue;" ><b>Api</h1>
1. "localhost:8080/restaurants" --> the Api is Used to save restaurants  and the type of this API is POST
<br>
<br>
2."localhost:8080/restaurants"--> The Api is Used to Get all type of restaurants added in our data source and the type of the api is GET
<br>
<br>
3. "localhost:8080/restaurant/restaurantId/{resId}" --> the Api returns a restaurant based on resId and the Type of the Api is GET.
<br>
<br>
4. "localhost:8080/restaurant/resId/{resId}/resSpeciality/{resSpeciality}"--> The Api Upadtes the filed of Speaciality of Restaurant whos  resId is matched with input resId and the type of the Api is PUT.
<br>
<br>
5."localhost:8080/restaurant/resId/{resId}"--> The Api Deletes the Resraurant whos resId matched with input resId.

<h1 style="color:blue;" ><b>Git Commands</h1>
$ git init
<br>
$ git status
<br>
$ git add .
<br>
$ git commit -m "Rakesh_Commit"
<br>
$ git remote add origin "https://github.com/rakesh1234-png/Restaurant_Management.git"
<br>
$ git push -u origin master
