/*//////////////////////////////////////////////////////////////////////////////
 * Failed Quest
 * File: Item.java
 *
 *  This item class will contain all of the possible data that an item can have,
 *      including functions for dropping and using an item. Items will be used
 *      in battle and be held in an array held in each character object.
 *
 * Created by: Caleb Miller
 * Created on Apr 27, 2016, 11:49:09 PM
 * for ICS 4UE - Mr. Wilhelm
 *//////////////////////////////////////////////////////////////////////////////

//import package
package failedquest;

//Create object class
public class Item {
	//Declare variables of object
	String itemName, effect;
	int value;
	double damage, heal;

	//Create constructor with variable parameters
	Item (String _itemName, String _effect, int _value, double _damage, double _heal) {
		//declare variables
		itemName = _itemName;
		effect = _effect;
		value = _value;
		damage = _damage;
		heal = _heal;
	}
}
