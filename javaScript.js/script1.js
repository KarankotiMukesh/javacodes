let a=Number(prompt("enter any number"));
if(a%3==0 && a%7==0)
{
    console.log(`${a} is multiple of 3 and 7`);
}
else if(a%7==0)
{
    console.log(`${a} is multiple of 7`)

}
else if(a%3==0)
{
     console.log(`${a} is multiple of 3`)
}
else
{
    console.log(`${a} is not multiple of 3 and 7`)
}

for(let i=1;i<=100;i++)
{
   if(i%3==0 && i%5==0)
    {
        console.log("fizzBuzz");
    }
    else if(i%3==0)
    {
    console.log("fizz");
    }
    else if(i%5==0)
    {
       console.log("Buzz");
    }
    else{
        console.log(i);
    }

}

let obj={
    name:"mukesh",
    lastname:"karankoti",
    age:21,
    location:"hyderabad",
    sex:"male",
    food:["biryani","all type of Non-Veg","Veg"]
};
console.log(obj.food);
console.log(obj.food.length);
let num=Number(prompt("enter the number of strings"));
var set=[num];
for(let i=0;i<num;i++)
{
var n=prompt(`enter string ${i+1}`);
 set.push(n);
}
set.sort();
 console.log(set);
 
