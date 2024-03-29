package ch5_LinkList.liinkStack;

// linkStack.java
// Реализация стека на базе связанного списка
// Запуск программы: C>java LinkStackApp
////////////////////////////////////////////////////////////////
class Link
{
    public long dData; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(long dd) // Конструктор
    { dData = dd; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(dData + " "); }
} // Конце класса Link
////////////////////////////////////////////////////////////////
class LinkList
{
    private Link first; // Ссылка на первый элемент в списке
    // -------------------------------------------------------------
    public LinkList() // Конструктор
    { first = null; } // Список пока не содержит элементов
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    { return (first==null); }
    // -------------------------------------------------------------
    public void insertFirst(long dd) // Вставка элемента в начало списка
    { // Создание нового элемента
        Link newLink = new Link(dd);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }
    // -------------------------------------------------------------
    public long deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp.dData; // Метод возвращает данные
    } // удаленного элемента
    // -------------------------------------------------------------
    public void displayList()
    {
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
// -------------------------------------------------------------
} // Конец класса LinkList
////////////////////////////////////////////////////////////////
class LinkStack
{
    private LinkList theList;
    //--------------------------------------------------------------
    public LinkStack() // Конструктор
    {
        theList = new LinkList();
    }
    //--------------------------------------------------------------
    public void push(long j) // Размещение элемента на вершине стека
    {
        theList.insertFirst(j);
    }
//--------------------------------------------------------------
public long pop() // Извлечение элемента с вершины стека
{
    return theList.deleteFirst();
}
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
//--------------------------------------------------------------
} // Конец класса LinkStack
////////////////////////////////////////////////////////////////
class LinkStackApp
{
    public static void main(String[] args)
    {
        LinkStack theStack = new LinkStack(); // Создание стека
        theStack.push(20); // Вставка элементов
        theStack.push(40);
        theStack.displayStack(); // Вывод содержимого стека
        theStack.push(60); // Вставка элементов
        theStack.push(80);
        theStack.displayStack(); // Вывод содержимого стека
        theStack.pop(); // Извлечение элементов
        theStack.pop();
        theStack.displayStack(); // Вывод содержимого стека
    }
} // Конец класса LinkStackApp
////////////////////////////////////////////////////////////////