class Deque {

    int size;
    int head; //голова
    int tail; //хвост
    int[] data;

    Deque(int size)
    {
        data = new int[this.size = size];
    }
    int PushBack(int value) //добавление в конец очереди
    {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
        return data[tail];
    }