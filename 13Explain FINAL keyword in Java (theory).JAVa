class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { // This will cause a compilation error
    //     System.out.println("Attempting to override.");
    // }
}

