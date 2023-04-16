package HW.java_familiarity.HW4;

import java.util.*;


public class Ex1 {
    public static void main(String[] args) {
        System.out.println(validBrackets("[{()}]"));
        System.out.println(validBrackets(""));
        System.out.println(validBrackets("[{())}]"));
        System.out.println(validBrackets("[{))}]"));
        System.out.println(validBrackets("[{))}]"));
    }

    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     * 4->3->2->1
     */

    static void reversArr() { // используя итератор переворачиваем коллекцию
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator<Integer> itr = list.listIterator(list.size());
        System.out.print("Реверс-Лист: ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
    public static void reverseListView() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Начальный список: " + list);
        reverseList(list);
        System.out.println("Реверсивный список: " + list);
    }

    /**
     *
     * @param list принимает линк|лист и рекурсивно разворачивает его
     */
    static void reverseList(LinkedList<Integer> list) {
        if (list.size() <= 1) {
        }
        else {
            Integer first = list.removeFirst();
            reverseList(list);
            list.addLast(first);
        }
    }

    /**
     * Given a string s containing just the characters
     * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     */
    private static boolean validBrackets(String bracketString) {
    Map<Character, Character> brackets = new HashMap<>();
    brackets.put(')', '(');
    brackets.put('}', '{');
    brackets.put(']', '[');

    Deque<Character> stack = new LinkedList<>();
        for (Character el: bracketString.toCharArray()) {
            if(brackets.containsValue(el)){
                stack.push(el);
            }
            else if (brackets.containsKey(el)){
                if (stack.isEmpty() || stack.pop() != brackets.get(el)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * красивое решение
     * @param s строка
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || c != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}



