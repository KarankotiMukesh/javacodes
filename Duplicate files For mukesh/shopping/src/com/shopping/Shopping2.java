package com.shopping;

/*Suppose you went to a Shopping Centre (Allen Solly) near your home and bought a pair of jeans.
 *  A week later, while traveling to a nearby town,
you spot another Shopping centre. You walk into the shop and find a new variant of the same brand
 which you liked even more. But you decided to buy it from the shop near to your home.
Once back home, you again went to the Shopping Centre near your home to get those amazing pair of 
Jeans but couldn't find it. Why?
Because that was a specialty of the shop that was located in the neighbouring town. 
use polymorphism concept in this scenario
*/
public class Shopping2 {
	public void center1()
	{
		System.out.println("brought a pair of jeans");
	}

}
//@override
class NewShopping extends Shopping2{
	
	public void Shopping()
	{
		System.out.println("new brand seen ");
	}
	public void center1()
	{
		System.out.println("out of stock sorry");
	}
}
