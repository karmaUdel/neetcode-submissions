class DynamicArray {

    int array[];
    int capacity;
    int length;
    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int i) {
        return this.array[i];
        
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(this.length == this.capacity){
            resize();
        }
        this.array[this.length] = n;
        this.length++;
    }

    public int popback() {
        if(this.length > 0){
            this.length--;
        }
        return this.array[this.length];
    }

    private void resize() {
        this.capacity *=2;
        int newArray [] = new int [this.capacity];
        for (int i = 0; i < this.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
