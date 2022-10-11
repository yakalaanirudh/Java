class outer{
    void Display()
    {
        class Inner
        {
            void InnerDisplay()
            {
                System.out.println("Hello");
            }
        }
        Inner i =new Inner();
        i.InnerDisplay();
    }
}

/*
The class Inner is visible and useful only inside the method Display
 */