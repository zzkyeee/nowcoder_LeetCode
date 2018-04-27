package niuke;

import util.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * 题目名称：copy-list-with-random-pointer
 * 题目描述：A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 * @author: zhangzhikai
 * @date: 2018/4/27 下午12:54
 * @version: V1.0.0
 * @since: JDK 1.8
 */

public class Problem17 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return null;
		}
		RandomListNode newList = new RandomListNode(0);
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode newNode = newList;
		RandomListNode oldNode = head;
		//复制旧结点的单链表，并存入map
		while (oldNode != null) {
			RandomListNode node = new RandomListNode(oldNode.label);
			newNode.next = node;
			map.put(oldNode, newNode.next);
			oldNode = oldNode.next;
			newNode = newNode.next;
		}
		oldNode = head;
		newNode = newList.next;
		//复制random结点
		while (oldNode != null) {
			newNode.random = map.get(oldNode.random);
			oldNode = oldNode.next;
			newNode = newNode.next;
		}
		return newList.next;
	}
}
