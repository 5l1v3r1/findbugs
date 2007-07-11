/*
 * FindBugs - Find Bugs in Java programs
 * Copyright (C) 2003-2007 University of Maryland
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package edu.umd.cs.findbugs.ba.ch;

import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ObjectType;

import edu.umd.cs.findbugs.ba.ObjectTypeFactory;
import junit.framework.TestCase;

/**
 * @author pwilliam
 */
public class Subtypes2Test extends TestCase {
	
	public void testArrays() throws ClassNotFoundException {
		ObjectType typeSerializable = ObjectTypeFactory.getInstance("java.io.Serializable");
		ObjectType typeClonable = ObjectTypeFactory.getInstance("java.lang.Cloneable");
		ObjectType typeObject = ObjectTypeFactory.getInstance("java.io.Serializable");
		ArrayType typeArraySerializable = new ArrayType(typeSerializable,1);
		ArrayType typeArrayClonable = new ArrayType(typeClonable,1);
		ArrayType typeArrayObject = new ArrayType(typeObject,1);
		ArrayType typeArrayArraySerializable = new ArrayType(typeSerializable,1);
		ArrayType typeArrayArrayClonable = new ArrayType(typeClonable,1);
		ArrayType typeArrayArrayObject = new ArrayType(typeObject,1);
		Subtypes2 test = new Subtypes2();
		// assertTrue(test.isSubtype(typeObject, typeObject));
		// assertTrue(test.isSubtype(typeClonable, typeObject));
	}

}
