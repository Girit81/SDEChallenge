CODING QUESTION - A discussion on the current and the alternative implementation can be found below:
01. Decorator Pattern - Although the MovingAvergeListImpl is not a full-blown implementation of decorator pattern,
    a few of its charectistics are employed here in order promote the re-use. In that, it wraps an instance of ArrayList
    and adds additional functionalities, such as moveWithAvg() function, and delegates certain tasks such as finding an
    element by index.
02. Encapsulation - The underlying data structure - in this case, the ArrayList - is hidden from the interface users as this
    will give the flexibility to change this data structure at a later time.
03. Alternative Implementation - Instead of using the ArrayList, I could have implemented a data structure purely using
    the Java array:
    private E[] array;
   
    public MovingAvergeListImpl(int initCapacity)
   {
      
         array = (E[]) new Object[initCapacity];

    }

    Such an implementation will demand additional test cases to ensure the smooth functions of add() and get() methods.

DESIGN QUESTION - Following artifacts are presented to solve the design question:
01. Component Diagram
02. Deployment Diagram