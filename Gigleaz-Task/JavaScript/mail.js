// // document.write("Hello")

// // window.prompt("please enter ur name")

// // a = "Apple"

// // console.log(a + "is red")

// // --------------------------------------






// //Variables-------------

// // var chandu = "Learning"

// // console.log(chandu)

// // var chandu= "Practicing"
// // console.log(chandu)

// // ---------------------






// // let chandu = "Learning"

// // console.log(chandu)

// //  chandu = "Practicing"
// // console.log(chandu)

// //---------------





// // const chandu = 'learning'
// //  console.log(chandu)

// //  chandu='practicing'
// //  console.log(chandu)












// //-------------------------------------------Data types-------------------------------------------

// //1.premitive -->String, Number, boolean, 

// // var chandu = "Hello" //String, double or single quote lo rasthamu....

// // console.log(chandu)
// // document.write(chandu +"<br>")


// // var chandu = 12345678910 // float, double annitini numbers eh antamu 
// // console.log(chandu)
// // console.log(typeof chandu); //aa variable ea data type oh thelusukovadaniki typeof ni use chesthamu
// // document.write(chandu+"<br>")


// // var chandu= 10>20   //boolean, conditions ni check cheyyadaniki
// // console.log(chandu)
// // document.write(chandu+"<br>")


// //2.Special --> Undefined, Null

// // var chandu  // undefined, manam variable declare chesi dhaniki manam ea value define cheyyakapothe dhanini undefined antamu...
// // console.log(chandu)


// // var chandu = null  //null, means dhanilo em value ledhu ani cheppadaniki....
// // console.log(chandu)



// //3.Composite --> Arrays, Objects

// //-------------------------------------------Arrays-------------------------------------------

// // let fruits = ["apple", "mango",55,{chandu:"learning"}]  //using square brackets
// // console.log(fruits)

// //-------------------------------------------Objects-------------------------------------------
// //curley brackets tho open and close and store key value pairs...
// // let games = {                       
// //    cricket : "kohli",
// //    football: "Messi",
// //    Tennis : "Fedaral"
// // }
// // console.log(games)
// // console.log(typeof fruits)



// //-------------------------------------------Operators-------------------------------------------

// // 1.Arithmetic Operator +,-,*,/,%,-(), ++(increment), --(decrement)
// let num1 = 7;
// let num2 = 4;
// console.log(num1+num2);
// console.log(num1-num2);
// console.log(num1*num2);
// console.log(num1/num2);
// console.log(num1%num2);
// console.log(num1++);   //post increment -->  after executing the statement it will return old value of num1
// console.log(num1--);     //post decrement -->   after executing the statement it will return old value of num1
// console.log(++num1);      //pre increment -->  mundhe value ni increment chesi print chesthadhi
// console.log(--num1);       // pre decrement -->  mundhe value ni decrement chesi print chesthadhi







// // 2.Assignment operators   +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |=, **=
// let x = 7 ;
// x+=6       //x = x + 6
// console.log(x)
// x-=3     //x = x - 3
// console.log(x)
// x*=8     //x = x * 8
// console.log(x)
// x/=2     //x = x / 2
// console.log(x)


//3.Bitwise operator // & - bitwise AND,  | - bitwise OR,  ~ - bitwise NOT,   ^ - bitwise XOR,    << - left shift ,  >> - right, >>> - zero fill right shift


// let a = 9;        //9 is 1011 in binary
// let b = 5;         //5 is 0101 in binary

// console.log(a & b);    // bit by bit and operation
//                          // 0 1  1 1 1 0 0 1 1
//                          // 0 1    1 0 1 0 0 1 1
//                           //===============
//                           // 0 1    1 1 1 0 0 1 1
//                            //             ========
//                            //             1 1  1 0 0 1 1
//                               //---------------------
//                                //              1 1  1 0 0 1

// console.log(a | b);    //bit by bit or operation
//                          // 0 1    1 1 1 0 0 1 1
//                          // 0 1    0 1 1 1 0 1 0
//                           //=====================
//                           // 0 1        1 1 1 1 1 

// console.log(~a);      // one's complement of a i.e., flipping all the bits of a number
//                          // 1011        -----1010

// console.log(a <<  2);  // shifting a to left by 2 positions
//                          // 1011         ----101100

// console.log(a >>    2);  //shifting a to right by 2 positions
//                          // 1011         ---101

// console.log(a >>>      2);  //zero filling shift to right
//                          // 1011         --101



//small programe
// let num = 17;
// console.log('num: ', num);

// console.log('Binary representation of num: ', num.toString(2));

// console.log("Is num an even number? ", num % 2 === 0 ? "Yes" : "No");

// if (num < 18) {
//     console.log("Congratulations! You are eligible for voting.");
// } else if (num >= 18) {
//     console.log("Sorry, you are not eligible for voting yet.");
// }

/*
Output:
num: 17
Binary representation of num: 11011
Is num an even number? No
Congratulations! You are eligible for voting.*/







//4.Comparison operator     == , != , > , < , >= , <=
// let a = 8;
// let b = 9;
// if (a==b){
//     console.log("Both are equal")
// }else if(a!=b){
//     console.log("They are not equal");
// }
// if(a>b){
//     console.log("A is greater than B")
// }
// if(a<b){
//     console.log("A is lesser than B")
// }
// if(a<=b && a>=8){
//     console.log("A lies between  8 and 9")
// }







// // 5.Logical operators      
// // Logical NOT (!) returns true if operand is False
// // AND(&&) returns true only if both sides are True
// // OR(||) returns True if either side is True
// let xx = true;
// let y = false;
// if(xx&&y){
//     console.log("Both conditions are True")
// }else{
//     console.log("At least one condition is False")
// }
// if(xx||y){
//     console.log("Atleast one of the conditions is True")
// }






// // 6.Typeof operator --> typeof
// console.log(typeof num1);
// console.log(typeof "Hello World");






//7.Ternary Operator
//condition? expr1 : expr2; -- > it will execute expr1 if condition is True, otherwise it will execute expr2
// let x=30;
// x>40 ? console.log("Value is greater than 40"):console.log("Value is not greater than 40");













// //-------------------------------------------Control and conditional statements-------------------------------------------

//TYPES OF CONDITAIONAL STATEMENTS  IN JAVASCRIPT
//1.If statement
// let age = prompt('Enter your Age');
// if (age >= 18) {
//     alert('You are eligible for voting');
// } else {
//     alert('You are not eligible for voting');
// }


// // var game = "cricket"
// // var game = "football"

// // var ccaptain = "kohli"
// // var fcaptain = "ronaldo"

// // if(game == "cricket"){
// //    document.write(ccaptain)
// // }
// // else if(game !== "football" ){
// // document.write(fcaptain)
// // }else{
// //    document.write("No such game ")
// // }


//2.Switch statement
// let month = prompt('Enter the Month in number format: ');
// switch (month) {
//     case 1:
//         document.write("<h1>January</h1>");
//         break;
//     case 2:
//         document.write("<h1>February</h1>");
//         break;
//     default:
//         if (month > 2 && month <= 9) {
//             document.write("<h1>Summer</h1>")
//         } else {
//             document.write("<h1>Winter</h1>");
//         }
// }





// //-------------------------------------------Terinory and conditional statements-------------------------------------------

// // document.write(
// //    2 +3 == 5 ? "Yes it is correct" : "No its wrong" // this line is terinory operator

// // )


// //-------------------------------------------Switch case statements-------------------------------------------

// // switch (true) {
// //   case 10 > 20:
// //     myAnswer = "10 is greater than 20";
// //     break;
// //   case 10 == 20:
// //     myAnswer = "10 is eqaul to 20";
// //     break;
// //   case 10 < 20:
// //     myAnswer = "10 is lessthan 20";
// //     break;
// //   default:
// //     myAnswer = "no of the above";
// //     break;
// // }

// // document.write(myAnswer);

// //-------------------------------------------Small Program for student grades-------------------------------------------

// // let name = prompt("Enter Your Name")

// // let marks = prompt("Enter Your Marks")

// // switch (true) {

// //    case marks > 90 && marks <= 100:
// //       result = "A+"

// //       break;

// //    case marks > 75 && marks <= 89:
// //       result = "A"
// //       break;
// //    case marks < 74 && marks > 51:
// //       result = "B"
// //       break;
// //    case marks < 50 && marks >= 35:
// //       result = "C"
// //       break;
// //    case marks <= 34:
// //       result = "You are fail..."
// //       break;
// //    default :
// // result="Please Entere your name and marks"
// //       break

// // }

// // document.write("Hi " + name + " <br/>Your Grade is " + result)





// //-------------------------------------------Type Conversion-------------------------------------------

// // var a = "21" //sring

// // document.write(typeof a, "<br>")

// // var z = parseInt(a) //coverting string to number

// // document.write(typeof z, "<br>")

// // var b = 55 //number

// // document.write(typeof b, "<br>")

// // var y = String(b) // converting number to string
// // document.write(typeof y, "<br>")





// //-------------------------------------------Loops-------------------------------------------

//oka task ni multiple time cheyyali ante manam loops vaadathamu...(Iterative  process)...




//1.for loop -------> it will run the block of code as many times as the condition specifies

// var c=0 ;
// for (c; c<6; c++) {
//     document.write("Hello World! <br>");
// }


                    // // for (var i =10; i>=1; i--) {
                    // //   document.write(i + ")" + "my name is chandu", "<br>");
                    // // }




//2.while loop ------> It will run the block of code until the condition becomes false

// var d=0;
// while (d<7){
//     document.write("I love Coding! <br> ");
//     d++;
// }




//3.do-while
// do while loop ----> The difference between do while and while is that in do while the statement inside the bracket always executes at least
// do while loop ----> It will first execute the block of code and then check the condition
//                    If the condition is true ,it will again execute the block of code

// e=8
// do{
//     document.write("Welcome to Programming! <br> ")
//     e--;
// }while(e>0);







// break statement --> used to stop the execution of a loop if some specific condition met

// var f=1;
// for (f; f<=5; f++){
//     if (f==3)
//         break;
//     else
//         document.write("The number is : "+f+"<br>")
// }





// continue statement --> Used to skip the current iteration of a loop and move directly to the next iteration
// continue statement --> Used to skip the current iteration of a loop and move directly to the next iteration
// continue statement --> Used to skip the current iteration of the loop and move directly to the next iteration
// continue statement --> Used to skip the current iteration of a loop and move directly to the next iteration
// continue statement --> used to skip the current iteration of a loop and move on to the next one

// var g = 1;
// for (g; g <= 5; g++) {
    //     if (g == 2)
    //         continue;
    //     else
    //         document.write("The number is: " + g + "<br>");
// }




//for of loop  --> it can be used with arrays or array-like objects, such as arguments object, strings etc. It gives us an easy way to iterate over each
                      //idhi only values ni mathrame isthundhi
// const marks = [25,30,40,48]

                  //this is for each loop idhi kakunda manam for of loop vaadochu 
//  marks.forEach(function(q){
//  document.write(q*2,"<br>")
// })

 // for of loop
//  for(const q of marks){
//     document.write(q*2,"<br>") 
// }






//for in loop  --> it loops through all enumerable properties of an object, it gives index value
                       //idhi values tho paatu index kuda isthundhi
//  const capitals = {
//        India: "New Delhi",
//        USA: "Washington D.C.",
//        France: "Paris",
//        Germany: "Berlin",
//       Canada: "Ottawa"
//     };

//      for(const c in capitals){

//        document.write(c," : ",capitals[c],"<hr>")

//      }




// var chandu = ["chandu","vani","laddu","sai"]

// // chandu.forEach(function(c){
// //     document.write(c,"</br>")
// // })

// for(c in chandu){
//     document.write(c,":",chandu[c],"</br>")
// }




// small programe

// var amount = 100
//  var days = 30
//  var intrest = 2

//  for(var i=1; i<days; i++){
//    if(i%4 ===0){
//     amount += intrest
//   }
//   document.write("your amount for "+ i+ "th day"+ amount,"<br>")


// // }





// //-------------------------------------------template string/literals-------------------------------------------

//using back-tick
// var c = 'chandu'
// document.write(`hello ${c} namasthe`)


//instead if using \n this 
// console.log(`chandu
// raparthi`);



  
//-------------------------------------------Arrays-------------------------------------------------

    // var names = ['chandu','sai','apparao']
    // document.write(names,"</br>")
//accessing the array elements
    // document.write(names[0])

//2nd way
// var names = new Array('chandu','sai','apparao');
// document.write(names)


                                           //Array methods 

//push() : add element to end of an array
// pop(): remove last element from array and return that value 
// shift(): remove first element from array and return that value  
// unshift(): add element at beginning of array 
// indexOf() : returns the first index at when a given element can be found in array or -1 if its not present
// slice(start,end): it doesnot change original array ,returns a subarray from start to end
// concat(): it combines two or more arrays and return new array
//join() : creates a new string concatinatig all the elements of an array and returns a string by specified separetor
//map() : executes a provided function once for each array element
// splice(start,deleteCount,item1,.....,ItemX): delete & insert item in array
                                // start: where to start , 
                                // deleteCount: how many elemnts are going to be deleted  
                                // Item1,....,Itemx: what will be added after deletion

                                // var fruits=['apple', 'banana', 'cherry'];
                                // document.write("Original Array: "+fruits+"<br/>");
                                // document.write("After adding 'grape' using push()" +"<br/>");
                                // fruits.push('grape')
                                // document.write(fruits+"<br/><br>");

                
                                // document.write("After removing 'last fruit' using pop()"+"<br/>");
                                // document.write("Removed fruit is:"+fruits.pop()+"<br/>");
                                // document.write("Current Array After Removing Banana:"+fruits+"<br/><br>");

                                // document.write("After Shifting 'apple' using shift() <br/>");
                                // var removedFruit=fruits.shift();
                                // document.write("Removed Fruit is:"+removedFruit+"<br/>");
                                // document.write("Current Array After Shifting:"+fruits+"<br><br>");


                                // var colors=["red","green","blue"];
                                // document.write("<br>Before Unshifting :"+colors+"<br>")
                                // colors.unshift("yellow");
                                // document.write("After Unshifting :"+colors+"<br><br>")

                                // var numbers=[45,67,89];
                                // var position=numbers.indexOf(67)
                                // document.write("Number 67 is at Position :"+position+"<br><br>")

                                // var arr = [0, 1, 2, 3,  4, 5];
                                // document.write("Array before slicing :"+arr+"<br>");
                                // var slicedArr=arr.slice(2,4);
                                // document.write("Sliced Array :"+slicedArr+"<br>");
                                // document.write("Original Array After Slicing :"+arr+"<br><br>");

                                // var x =[1,2,3,'a','b','c'];
                                // document.write("Array Before sorting :"+x+"<br>");
                                // x.sort();
                                // document.write("Array After Sorting :"+x+"<br>");




// //Array Methods

//1.push() : add element to end of an array

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];
// // games.push("chess ", "badminton ", "table tennis", " carrom");

// // document.write(games + "<br>");
// // document.write(games.length);




// //2.pop(): remove last element from array and return that value 

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];
// // let deletedGame = games.pop();

// // document.write(games,"<br>")
// // document.write("deleted game is " +deletedGame)





// //3.Shift : remove first element from array and return that value  
// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // var deletedGame = games.shift();

// // document.write(games + "<br>")

// // document.write(deletedGame)





// //4.Unshift : add element at beginning of array 

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // var addedGames = games.unshift("Aqatics","table tennis ")

// // document.write(games,addedGames)





// //5.Concat : it combines two or more arrays and return new array

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // let players =["Kohli", "Kittu", "Chandu", "Dhoni"]

// // var gamesAndPlayers = games.concat(players)

// // document.write(gamesAndPlayers)





// //6.join() : creates a new string concatinatig all the elements of an array and returns a string by specified separetor
// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // let myGames= games.join(" : ")

// // document.write(myGames)






// //7.slice(start,end): it doesnot change original array ,returns a subarray from start to end

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // let myGames = games.slice(0,3)

// // document.write(myGames)





// //10.ForEach

// // let games = ["cricket ", "volley ball ", "tennis ", "football "];

// // games.forEach(function(chandu , index){

// //    document.write(index+1 + " . "+chandu+"<br>")

// // })





// //Srting Methods

// // nam = "CHANDU"

// // document.write(nam.charAt(2))








                            





// //-------------------------------------------Dialog Boxex-------------------------------------------

// // var women = confirm("are u women")

// // if(women){

// //    let name = prompt("Please enter you are name Madam")

// //    document.write("Hello Madam "+name)
// // }else{
// //    let name = prompt("Sir! Please You are name")
// //    document.write("Hai sir Welcome "+name)
// // }








// //-------------------------------------------Functions-------------------------------------------------------------------------

// function sum(num1,num2){
//     var result = num1+num2
//     return result;
// }
// document.write(sum(3,9987));




//Function Expression --> assign funtion to one variable (oka variable ki function ni aasign cheyyadanni)
// add = function sum(num1,num2){
//     var res=num1 + num2;
//     return res;
// }
// document.write(add(9,7))


            // var a = function chandu(){
            //    document.write("My name is chandu")
            // }
            // a()






//types of functions
//1.named functions
//2.Anonymous functions
//3.IIFE (immediatly invoked function expression)
//4.Arrow function


//1.Named Functions
        // function sum(num1,num2){
        //     var result = num1+num2
        //     return result;
        // }
        // document.write(sum(3,9987));


//2.Anonymous functions --> (oka function ki name undadho dhanini anonymous function antamu) dhiniki oka variable ni assign cheyyali lekapothe error chupisthundhi
        // var chandu = function(num1,num2){
        //     var result = num1+num2
        //     return result;
        // }
        // document.write(chandu(5,8))


//3.IIFE (immediatly invoked function expression) --> when we want to execute a function immediatly where they created, IIFE used.
                                                    //Immediately Invoked Function Expressions (IIFE)
                                                        // IIFE is a type of anonymous function that gets called at the end of its declaration

                // var cc = (function num(num1,num2){
                //     var result = num1+num2
                //     return result;
                // }) (6,6)
                // document.write("The value is "+cc);


//4.Arrow function --> we dont assign function name and function ane keyword also
                //  var chandu =(num1,num2)=>{
                //     var res = num1+num2
                //     return res;
                //  }
                // document.write(chandu(3,9))  

                //OR

                // var chandu =    (num1,num2)=> num1-num2
                // document.write(chandu(79,33)) 


                 //OR

                //parameter okate unte () ivi kuda avasaram ledhu
                // chandu = num2 => num2*num2
                // document.write(chandu(9))

                            //no arguments aithe / arguments em lekapothe
                            //  var chandu =()=>document.write("namasthe")
                            //  chandu();






// function with parameters and return value----------

// // var userName = prompt("Enter Your Name")
// // var chandu = function(myFriend){
// //    return document.write("Hello "+myFriend +" Welcome to my world")
// // }
// //  chandu(userName);




// // function chandu(){
// //    document.write("My Name is Chandu <br>")
// // }
// // chandu(); //-----> this is function calling  semicollon is must









// //-------------------------------------------Scopes-------------------------------------------

//1.Global scope

// var name = "Chandu"
// let age = 24
// const gender = "Male"

// function myDetails(){
//    document.write(name, "<br>")
//    document.write(age, "<br>")
//    document.write(gender, "<br>")
// }

// myDetails()






//2.Function scope

// function myDetails(){
//    let nam = "Chandu"
//    var age= 24
//    const gender= "male"

//    document.write(nam, "<br>")
//       document.write(age, "<br>")
//       document.write(gender, "<br>")
// }

// myDetails()








//3.Block_Scope

// function myDetails() {
//   if (10 < 20) {
//     let nam = "chandu";
//     const gender = "male";
//     var age = 24;

//     document.write(nam, "<br>");
//     document.write(age, "<br>");
//     document.write(gender, "<br>");
//   }
//   document.write(age, "<br>");
//   document.write(nam, "<br>");
//   document.write(gender, "<br>");
// }

// myDetails();




// //------------------------------------------------------ Default parameters and Named parameters and Rest parameters ------------------------------------------------------------------------------------

//1.Default
// function chandu(num1,num2=3){
// var result = num1+num2
// return `The sum of ${num1} and ${num2} is ${result}`
// }
// document.write(chandu(8)) 
//incase default parameter ivvakapothe aa value dhaggara undefined isthundhi and result dhaggara Nan(not a number) ani vasthundhi

//2.Named Parameters
// function person({name="Chandu",age=25}){
//    return `${name},${age}`
// }
// document.write(person())

//3.Rest --> default param tharuvatha ...(3 dots ichi nachina name tho declare chesukovachu...)
// function chandu(num1, num2=3,...ch){
// var result = num1*num2
// for(num of ch){
//     res = result+num
// } 
// return res;
// }
// document.write(chandu(5,3,6))






// //------------------------------------------------------ forEach ------------------------------------------------------------------------------------
//forEach use chesthe array lo prathi okka element meedha fuction apply avuthundhi....
// var salaries =[20000,30000,40000,50000]

// document.write(salaries,"<br>")
// salaries.forEach((salary, index)=>{
//     let increment = salary/10
//     salaries[index]= salary+increment
// })
// document.write(salaries)






// //------------------------------------------------------ Set  ------------------------------------------------------------------------------------

//Set: set of unique values(same as array but it not accepting duplicate values)

// let s = new Set() //create a set object
// console.log(s,"<br>");
// s.add("A").add("b").add("a").add("A")
// console.log(s);


//convert array to set
// let ss = [24,43,45,56,43,453,523,24]
// console.log(ss);
// let s1 = new Set(ss) 
// console.log(s1);

//--------------------Set Methods-------------------

// .size : returns the number of elements in the set
// s1.size
// console.log(s1.size);

// .add(valueToBeAdded): adds an item into the set
// s1.add(987)
// console.log(s1);

// .delete(valueToBeDeleted): removes the specified value from the set
// s1.delete(43)
// console.log(s1);

// .has(value): checks whether the given value is present in the set or not
//               and return true if yes else false
// console.log(s1.has(43));


// .clear(): remove all items from the set
// s1.clear();
// console.log(s1);




// //---------------------------------------------------------Objects---------------------------------------------------------

// const capitals = {
//    India: "New Delhi",
//    USA: "Washington D.C.",
//    France: "Paris",
//    Germany: "Berlin",
//    Canada: "Ottawa"
//  };


//  document.write(capitals.France)

//  for(cap in capitals){
//     document.write(`<br>${cap}: ${capitals[cap]}`)
 
// }


// function chandu(n,a,g){
//     this.name=a;
//     this.age=g;
//     this.gender=g;
// }
// var obj=new chandu("chandu",25,"male");
// console.log(obj.name+" "+obj.age+ " "+obj.gender);




// // const a= document.getElementById("navBar")

// // a.textContent="R.Chandu"

// // console.log(a)




// // const a = document.getElementsByClassName("navbar-brand")[0]

// // a.textContent = "Chandu"

// // console.log(a)


// //idhi anni tag names ki apply avuthundhi
// // var a = document.getElementsByTagName('a')

// // for(i=0; i<a.length; i++){
// // a[i].textContent ='click me'

// // } 

// // console.log(a)


// // const a = document.querySelector("#company")   

// // a.innerHTML= 'Raparthi'



// // var x= document.querySelector('#company')

// // // x.innerText = 'Chandu'

// // x.innertexr = 'Chandu'
// // console.log(x.textContent)




// //Attributes


// //getattribute
// // var chandu = document.querySelector('.head').attributes.class.value


// // console.log(chandu);


// // const chandu = document.querySelector('nav')

// // chandu.setAttribute("style","border : 5px solid")


// // const chandu = document.querySelector('.navbar-toggler-icon')

// // chandu.setAttribute("style","background-color: red")



// //Remove Attribute

// // const Chandu = document.querySelector('.btn-outline-success')

// // Chandu.removeAttribute('class')




// //CSS in JS

// // document.querySelector('.container-fluid').style.backgroundColor="skyblue"




// // const darkTheme = function(){
// //    document.querySelector('body').style.backgroundColor = 'black'

// // }
// // const lightTheme = function(){

// // document.querySelector('body').style.backgroundColor = 'white'

// // }


// // function eleHover(element){

// //    element.style.backgroundColor="yellow"

// // }

// // function eleOut(item){

// //    item.style.backgroundColor='white'

// // }



// // const loginButton = document.querySelector('#loginButton')
// // const loginModel = document.querySelector('.login')
// // const card =document.querySelector('.card')
// // const buttonn = document.querySelector('#buttonn') 



// // loginButton.onclick = showLogin

// // function showLogin(){
// //    card.style.display="none";
// //    buttonn.forEach(function(item){
// //       item.style.display="none"
// //    })

// //    login.style.display="block"
// // }


// // document.getElementById("close").addEventListener('click',hideLogin)

// // function hideLogin(){
// //    card.style.display="block";
// //    buttonn.forEach(function(item){
// //       item.style.display="block"
// //    })

// //    login.style.display="none"
// // }



// // document.getElementById("gogo").addEventListener('mouseover', function(){
// //    this.style.background='green'
// // })

// // document.getElementById("gogo").addEventListener('mouseout', function(){
// //    this.style.background='blue'
// // })


// // const navBorder = document.getElementById('border')
// // navBorder.addEventListener('click', addBorder)

// // function addBorder(){
// //    document.querySelector("header").style.border="5px solid black"

// // }

// // if(10>20){

// //    navBorder.removeEventListener('click', addBorder)
// // }


// //formEvents

// // const maiForm = document.getElementById("myForm")

// // const userName = document.getElementById("nameInput")
// // const inputName = document.getElementById("name")


// // maiForm.addEventListener('submit',function(e){
// //    e.preventDefault()

// //   const myuserName = userName.value
// //   inputName.textContent= myuserName

// //   maiForm.reset()

// // })



// // //focusEvent

// // const nameInput1 = document.getElementById("nameInput")

// // nameInput1.addEventListener('focus' ,function(r){

// //    r.target.style.background='pink'

// // })

// // nameInput1.addEventListener('blur' ,function(r){

// //    r.target.style.background='white'

// // })




// //Date Method

// // const toDay = new Date()

// // document.write(toDay)





// //set intervalls and clear interval


// // Define a function to be executed repeatedly
// // function printTime() {
// // document.write(new Date(),"<br>")
// //  }
 
// //  // Execute the printTime function every 1000 milliseconds (1 second)
// //  const intervalID = setInterval(printTime, 1000);

// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// // function printTime() {
// //    console.log(new Date());
// //  }
 
// //  // Execute the printTime function after 3000 milliseconds (3 seconds)
// //  const timeoutID = setTimeout(printTime, 3000);


// // function printTime() {
// //    console.log(new Date());
// //  }
 
// //  // Execute the printTime function after 3000 milliseconds (3 seconds)
// //  const timeoutID = setTimeout(printTime, 3000);
 
// //  // Cancel the execution of the printTime function
// //  clearTimeout(timeoutID);


// // document.getElementById('reverseButton').addEventListener('click', function () {
// //    var inputText = document.getElementById('inputText').value;
// //    var reversedText = reverseString(inputText);
// //    document.getElementById('outputText').innerText = "Reversed: " + reversedText;
// // });

// // function reverseString(str) {
// //    return str.split('').reverse().join('');
// // }


// // var game = "Cricket"

// // document.write(`I like Playing ${game}`)


// // const apple=(x,y)=>{
// //    document.write(x+y)

// // }
// // apple(20,40)



// //for of

// // const marks = [25,30,40,48]

// // // marks.forEach(function(q){
// // // document.write(q*2,"<br>")
// // // })


// // for(const q of marks){
// //    document.write(q*2,"<br>")  // for of loop
// // }


// //for in


// // const capitals = {
// //       India: "New Delhi",
// //       USA: "Washington D.C.",
// //       France: "Paris",
// //       Germany: "Berlin",
// //       Canada: "Ottawa"
// //     };

// //     for(const c in capitals){

// //       document.write(c," : ",capitals[c],"<hr>")

// //     }



// //Rest and Spread operator

// // let games =["cricket ", "volley Ball ", "tennis "]

// // let sports=["football ","coco " ]

// // var gamesSports=[...games, ...sports]

// // document.write(gamesSports)





// //Rest Operator
// // function user(name,...remaining){

// //    console.log(name+" : "+remaining)

// // }

// // user('chandu', 22," g@gmail.com",  123455678)



// //Spread Operator

// // const toggleButton = document.getElementById('toggleMode');
// // toggleButton.addEventListener('click', function() {
// //    document.body.classList.toggle('dark-mode');
// // });


// //------------------------------CSS Word -------------------------------------

// // let games = {
// //    cricket : 'dhoni',
// // football : 'ronaldo',
// // tennis : 'sania'
// // }



// // for(x in games){
// //    console.log(x)
// // }

// // let color = {

// //    denger : 'red',

// //    happy : 'white'

// // }

// // console.error(color.denger);


// // console.table({name:'chandu',age:24,gender:'male'})



// // alert("Dont see")

// // let name = prompt('enter u r name','nnnn')

// // document.write(name)



// // let btn1 = document.getElementById('color')
// // // let btn2 = document.getElementsByClassName('DD')

// // btn1.addEventListener("click",()=>{

// //    document.body.style.backgroundColor='red'
// // })


// // btn1.onmouseover = ()=>{
// //    document.body.style.backgroundColor='blue';
// // }


// // btn1.addEventListener("click",leave)

// // function leave(){
// //    document.body.style.backgroundColor='white'

               
// // }

// //-------------------------------------------SetTimeOuts-------------------------------------------


// // setTimeout(() => {
// //    alert('This is after 3 seconds later')
// //   clearInterval()
// // }, 3000);



// //-------------------------------------------Callback-------------------------------------------


// // function test(a){
// // a()

// // }
// // test(()=>{
// //    console.log("This is callbacj function");
// // })




// // function first(test){

// //    console.log('this is first function');
// //    test()
// // }

// // function second(){

// //    console.log('this is second function');
// // }


// // first(second)


// //-------------------------------------------Closure-------------------------------------------


//             // let count = 0

//             // function updateCount(){

//             //    count = count+1

//             //    let p = document.getElementById('count')

//             //    p.innerText = `Clocked :  ${count}`;



//             // }



