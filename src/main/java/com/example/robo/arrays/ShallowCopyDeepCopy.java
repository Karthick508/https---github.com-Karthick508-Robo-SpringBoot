package com.example.robo.arrays;

public class ShallowCopyDeepCopy extends Shallow {

    
    /**
     * ? Shallow Copy
     * @throws CloneNotSupportedException
     */
    public void shallowDeep() throws CloneNotSupportedException {

        // !Shallow copy heap memory have 1 object
        Shallow object = new Shallow(); // created Object
        object.i = 5;
        object.j = 6;
        System.out.println("Object " + object);

        Shallow object1 = object; // !here we created one object and two reference and object is same
        object1.i = 11;
        object1.j = 12;
        System.out.println("Object First " + object1);
        System.out.println("Object " + object);

        // ! Deep Copy - creating 2 Objects and stored in 2 memory every we can give new
        // ! value and it doesn't override
        Deep deepObj = new Deep();
        deepObj.k = 22;
        deepObj.l = 23;

        System.out.println("Deep Obj Norm" + deepObj);

        Deep deepObj1 = new Deep();
        deepObj1.k = deepObj.k;
        deepObj1.l = deepObj.l;

        deepObj1.k = 33;
        deepObj1.l = 44;

        System.out.println("Deep Obj 1 " + deepObj1);
        System.out.println("Deep Obj " + deepObj);

        // !Cloning - creating 1 new Constructor and assign values to another object and
        // ! it doesn't override and syntax like shallow copy and operation like deep copy
        // ! basically it is protected type we need to implements and add an exception
        // ! wherever we need to call this method
        Cloning cloneObj = new Cloning();
        cloneObj.m = 55;
        cloneObj.n = 66;
        System.out.println("cloneObj" + cloneObj);

        Cloning cloneObj1 = (Cloning) cloneObj.clone();
        cloneObj1.m = 77;
        cloneObj1.n = 88;
        System.out.println("cloneObj1" + cloneObj1);
        System.out.println("cloneObj afterCopied" + cloneObj);

    }

}

class Shallow {
    int i;
    int j;

    @Override
    public String toString() {
        return "Shallow [i=" + i + ", j=" + j + "]";
    }
}

class Deep {
    int k;
    int l;

    @Override
    public String toString() {
        return "Deep [k=" + k + ", l=" + l + "]";
    }
}

class Cloning extends Object implements Cloneable {
    int m;
    int n;

    @Override
    public String toString() {
        return "Cloning [m=" + m + ", n=" + n + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

}
