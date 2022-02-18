package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class List {

    Node pFirst;
    Node pLast;
    int size;

    // Constructor
    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
//
//    //Lista vacia
//    public boolean isEmpty() {
//        return pFirst == null;
//    }
//
////    public void print() {
////        Node aux = pFirst;
////        while (aux != null) {
////            System.out.println(aux.gettInfo());
////            aux = aux.getpNext();
////        }
////    }
////    public String getListInfo() {
////        Node aux = pFirst;
////        String x = "";
////        while (aux != null) {
////            x += aux.gettInfo() + "\n";
////            aux = aux.getpNext();
////        }
////        return x;
////    }
//
//    public Node first() {
//        return pFirst;
//    }
//
//    //Funcion insertar al final
//    public void insertLast(int day_Time, int day, int init_leg_pdc,int init_screw_pdc,int init_board_pdc,int init_asb) {
//        Node newNode = new Node(day_Time,day, init_leg_pdc,init_screw_pdc,init_board_pdc,init_asb);
//        if (isEmpty()) {
//            pFirst = newNode;
//            pLast = newNode;
//        } else {
//            pLast.setpNext(newNode);
//            pLast = newNode;
//        }
//        size++;
//    }
//
//    public Node getNode(Object x) {
//        Node aux = getpFirst();
//        if (this.isEmpty()) {
//            System.out.println("La lista esta vacia");
//        } else {
//            while (aux != null) {
//                if (aux.gettInfo() == x) {
//                    return aux;
//                } else {
//                    aux = aux.getpNext();
//                }
//            }
//            System.out.println("El elemento ingresado no se encuentra en la lista");
//        }
//        return aux;
//    }
//
//    public boolean exists(Object tInfo) {
//        boolean verif = false;
//        Node aux = pFirst;
//        while (aux != null) {
//            if (aux.gettInfo() == tInfo) {
//                verif = true;
//            }
//            aux = aux.getpNext();
//        }
//        return verif;
//    }
//
//    public Object getPrev(Object tInfo) {
//        Node aux = getpFirst();
//        Node auxNext = pFirst.getpNext();
//        if (!this.isEmpty()) {
//            while (auxNext != null) {
//                if (tInfo == auxNext.gettInfo()) {
//                    return aux.gettInfo();
//                } else {
//                    auxNext = auxNext.getpNext();
//                    aux = aux.getpNext();
//                }
//            }
//        } else {
//            System.out.println("La lista esta vacía");
//        }
//        return null;
//    }
//
//    public void delNodeByInfo(Object tInfo) {
//        if (!isEmpty()) {
//            Node aux = pFirst.getpNext();
//            Node aux1 = pFirst;
//            if (aux1.gettInfo() == tInfo) {
//                deleteFirst();
//            } else {
//                while (aux != null) {
//                    if (aux.gettInfo() == tInfo && pLast.gettInfo() == tInfo) {
//                        aux1.setpNext(aux.getpNext());
//                        pLast = aux1;
//                        aux.setpNext(null);
//                        size--;
//                        break;
//
//                    } else if (aux.gettInfo() == tInfo) {
//                        aux1.setpNext(aux.getpNext());
//                        aux.setpNext(null);
//                        size--;
//                        break;
//                    } else {
//                        aux = aux.getpNext();
//                        aux1 = aux1.getpNext();
//                    }
//                }
//            }
//        } else {
//            System.out.println("La lista esta vacía");
//        }
//    }
//
//    public void delNodeByNode(Node node) {
//        if (!isEmpty()) {
//            Node aux = pFirst.getpNext();
//            Node aux1 = pFirst;
//            if (aux1 == node) {
//                deleteFirst();
//            } else {
//                while (aux != null) {
//                    if (aux == node) {
//                        aux1.setpNext(aux.getpNext());
//                        aux.setpNext(null);
//                        size--;
//                        break;
//                    } else {
//                        aux = aux.getpNext();
//                        aux1 = aux1.getpNext();
//                    }
//                }
//            }
//        } else {
//            System.out.println("La lista esta vacía");
//        }
//    }
//
//    //Funcion insertar al inicio
//    public void insertFirst(Object tInfo) {
//        Node newNode = new Node(tInfo);
//        if (isEmpty()) {
//            pFirst = newNode;
//            pLast = newNode;
//        } else {
//            newNode.setpNext(pFirst);
//            pFirst = newNode;
//        }
//        size++;
//    }
//
//    //Funcion insertar en el medio
//    public void insertAfer(int n, Object tInfo) {
//        Node node = new Node(tInfo);
//        if (isEmpty()) {
//            pFirst = node;
//            pLast = node;
//        } else {
//            Node aux = pFirst;
//            int count = 0;
//            while (aux != null && count < n) {
//                aux = aux.getpNext();
//                count++;
//            }
//            node.setpNext(aux.getpNext());
//            aux.setpNext(node);
//        }
//        size++;
//    }
//
////Vaciar la lista
//    public void emptyList() {
//        pFirst = pLast = null;
//        size = 0;
//    }
//
////Eliminar primer elemento
//    public void deleteFirst() {
//        if (!this.isEmpty()) {
//            if (getsize() == 1) {
//                emptyList();
//            } else {
//                setpFirst(getpFirst().getpNext());
//                size--;
//            }
//        }
//    }
//
////Funcion obtener index
//    public int getIndex(Node pValue) {
//        if (!isEmpty()) {
//            Node aux = pFirst;
//            int count = 0;
//            while (aux != pValue) {
//                aux = aux.getpNext();
//                count++;
//            }
//            return count;
//        } else {
//            return -1;
//        }
//    }
//
//    public void delNodeByPos(int n) {
//        if (pFirst != null) {
//            if (n == 0) {
//                deleteFirst();
//            } else if (n < size) {
//                Node temp = pFirst;
//                int count = 0;
//                while (count < (n - 1)) {
//                    temp = temp.getpNext();
//                    count++;
//                }
//                Node del = temp.getpNext();
//                temp.setpNext(del.getpNext());
//                del = null;
//                size--;
//            }
//        }
//    }
//
////Obtener nodo a partir de un index
//    public Node getNode(int pos) {
//        Node aux = this.getpFirst();
//        if (!isEmpty()) {
//            for (int i = 0; i < pos; i++) {
//                aux = aux.getpNext();
//            }
//            return aux;
//        } else {
//            return null;
//        }
//    }
//
//    public Node getpFirst() {
//        return pFirst;
//    }
//
//    /**
//     * @param pFirst the pFirst to set
//     */
//    public void setpFirst(Node pFirst) {
//        this.pFirst = pFirst;
//    }
//
//    /**
//     * @return the pLast
//     */
//    public Node getpLast() {
//        return pLast;
//    }
//
//    /**
//     * @param pLast the pLast to set
//     */
//    public void setpLast(Node pLast) {
//        this.pLast = pLast;
//    }
//
//    /**
//     * @return the iN
//     */
//    public int getsize() {
//        return size;
//    }
//
//    /**
//     * @param iN the iN to set
//     */
//    public void setsize(int size) {
//        this.size = size;
//    }
}
