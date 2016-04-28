/*//////////////////////////////////////////////////////////////////////////////
 * Failed Quest
 * File: Character.java
 *
 *  This object class will store all of the data that any character, mob, or
 *	boss in the game will contain. This class will posses several variables
 *	such as name, attack, ranged attack. The class will also contain an 
 *      array that contains status affects placed on the character. By not
 *      having an array instead of an enum, the character can have multiple
 *      status effects. Enemy mobs will be generated from this same class. By
 *      having everything have the same variables, it will become easier to
 *      program interactions between objects. Will have an array to store that
 *      player’s items.
 *
 * Created by: Caleb Miller
 * Created on Apr 27, 2016, 11:49:09 PM
 * for ICS 4UE - Mr. Wilhelm
 *//////////////////////////////////////////////////////////////////////////////

//Import package
package failedquest;

//Import required libraries
import java.util.ArrayList;

//Create object class
public class Character {
	//Declare variables of object
	String charName, charClass;
	int HP, maxHP;
	float attack, rAttack, mAttack;

	//Arrays will store objects
	ArrayList buffs, debuffs, items = new ArrayList();

	//Create constructor with variable parameters
	Character (String _charName, String _charClass, int _HP, int _maxHP,
				float _attack, float _rAttack, float _mAttack,
				ArrayList _buffs, ArrayList _debuffs, ArrayList _items) {

		//declare variables
		charName = _charName;
		charClass = _charClass;
		HP = _HP;
		maxHP = _maxHP;
		attack = _attack;
		rAttack = _rAttack;
		mAttack = _mAttack;
		buffs = _buffs;
		debuffs = _debuffs;
		items = _items;
	}
}
