'use strict'
// var a=10;
// var b=202;
//  let c=true;
//  let d;
 
//  function sub(a,b)
//  {
//      return a-b;
//  }

//  function mul(a,b)
//  {
//    return a*b;
//  }
//   function add(a,b)
//   {
//     c= a+b;
//       console.log(`the addition is ${c}`);
//       console.log(`the substraction is ${sub(a,b)}`)
//       let e=mul(a,b);
//       console.log(e);

//   }
    
//       add(a,b);
//    const  arr=[101,102,103,'mukesh'];
//   console.log(arr);
//   arr[1]="mukki";
//   console.log(arr);
//  // arr=[101,mukesh];
//   console.log(arr);
//   let  arr1=[101,102,103,'mukesh'];
//   console.log(arr);
//   arr1[1]="mukki";
//   console.log(arr1);
//  // arr1=[101,mukesh];
//    console.log(arr1);
//    arr.push('muki');
//    console.log(arr);
//    arr.pop();
//    console.log(arr);
//    arr.unshift('ironman');
//    console.log(arr);
//    arr.shift();
//    console.log(arr);

// let a1=
// {
    
//     firstName:"karankoti",
//     lastName:"mukesh",
//     age:2,
//     location:"Nalgonda",
//     sex:"male",
//     friends:["a1",'a2','a3','a4','a5'],
//     add: function(a,b)
//     {
//            return a+b;
//     }
// };

// a1['locat']="hydearbad";
// a1.loc="ibrahimpatnam";
// console.log(a1);
// console.log(`${a1.firstName} has ${a1.friends.length} and his bestfriend is ${a1.friends[0]}`);
// console.log(a1.add(2,5));
// console.log(`${a1.firstName} is ${a1.age} years old has ${a1.age>18?"a":"no"} drivinglicensce `);

//let ran=Math.random();
let a=Math.trunc(Math.random()*6+1);
while(a>=0)
{
    a=Math.trunc(Math.random()*6+1);
    if(a==4)
    {
        console.log(`you won the match`);
        break;
    }
    else{
        console.log(`you rolled ${a}`);
    }
}

