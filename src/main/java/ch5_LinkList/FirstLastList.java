package ch5_LinkList;

// firstLastList.java
// Работа с двусвязным списком
// Запуск программы: C>java FirstLastApp
////////////////////////////////////////////////////////////////
class Link2
{
    public long dData; // Данные
    public Link2 next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link2(long d) // Конструктор
    { dData = d; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(dData + " "); }
// -------------------------------------------------------------
} // Конец класса Link2
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
class FirstLastList
{
    private Link2 first; // Ссылка на первый элемент
    private Link2 last; // Ссылка на последний элемент
    // -------------------------------------------------------------
    public FirstLastList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
        last = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    { return first==null; }
    // -------------------------------------------------------------
    public void insertFirst(long dd) // Вставка элемента в начало списка
    {
        Link2 newLink2 = new Link2(dd); // Создание нового элемента
        if( isEmpty() ) // Если список пуст,
            last = newLink2; // newLink2 <-- last
        newLink2.next = first; // newLink2 --> старое значение first
        first = newLink2; // first --> newLink2
    }
    // -------------------------------------------------------------
    public void insertLast(long dd) // Вставка элемента в конец списка
    {
        Link2 newLink2 = new Link2(dd); // Создание нового элемента
        if( isEmpty() ) // Если список пуст,
            first = newLink2; // first --> newLink2
        else
            last.next = newLink2; // Старое значение last --> newLink2
        last = newLink2; // newLink2 <-- last
    }
    // -------------------------------------------------------------
    public long deleteFirst() // Удаление первого элемента списка
    { // (предполагается, что список не пуст)
        long temp = first.dData;
        if(first.next == null) // Если только один элемент
            last = null; // null <-- last
        first = first.next; // first --> старое значение next
        return temp;
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link2 current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
// -------------------------------------------------------------
} // Конец класса FirstLastList
////////////////////////////////////////////////////////////////
class FirstLastApp
{
    public static void main(String[] args)
    { // Создание нового списка
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22); // Вставка в начало списка
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // Вставка в конец списка
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayList(); // Вывод содержимого списка
        theList.deleteFirst(); // Удаление первых двух элементов
        theList.deleteFirst();
        theList.displayList(); // Повторный вывод
    }
} // Конец класса FirstLastApp
////////////////////////////////////////////////////////////////