class DoublyLinkedList<T> {
    private Element<T> head = null;

    void push(T value) {
    	Element<T> newElement = new Element(value, null, null);

        if (head == null) {
        	head = newElement;
        	return;
        }

        Element<T> temp = head;
        while (temp.getNext() != null) {
        	temp = temp.getNext();
        }
        temp.setNext(newElement);
        newElement.setPrev(temp);
    }

    T pop() {
        if (head == null) {
        	return null;
        }

        Element<T> temp = head;
		T returnValue;

		if (head.getNext() == null) {
			returnValue = head.getValue();
			head = null;
			return returnValue;
		}

        while(temp.getNext() != null) {
        	temp = temp.getNext();
        }
		returnValue = temp.getValue();
		temp.getPrev().setNext(null);
		return returnValue;
    }

    void unshift(T value) {
		Element<T> newElement = new Element(value, null, null);
		if (head == null) {
			head = newElement;
			return;
		}
		newElement.setNext(head);
		head.setPrev(newElement);
		head = newElement;
    }

    T shift() {
        if (head == null) {
			return null;
		}

		Element<T> temp = head;
		T returnValue;

		if (temp.getNext() == null) {
			returnValue = temp.getValue();
			temp = null;
			return returnValue;
		}

		returnValue = temp.getValue();
		temp.getNext().setPrev(null);
		head = temp.getNext();
		return returnValue;
    }

    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;

        Element(T value, Element<T> prev, Element<T> next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
        }

        public T getValue() {
        	return this.value;
        }

        public Element<T> getPrev() {
        	return this.prev;
        }

        public void setPrev(Element<T> element) {
        	this.prev = element;
        }

        public Element<T> getNext() {
        	return this.next;
        }

        public void setNext(Element<T> element) {
        	this.next = element;
        }
    }
}
