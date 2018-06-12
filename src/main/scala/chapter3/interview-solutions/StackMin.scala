package chapter3.solutions

/** A stack of ordered elements, tracking the minimum element in the stack
 *
 *  @tparam an ordered type
 */
class StackMin[T] {

  /** Add an item to the top of the stack 
    *
    * @param the item inserted
    */
  def push(item: T): Unit = ???

  /** Remove an item at the top of the stack
    *
    * @return the last element inserted
    */
  def pop(): Option[T] = ???

  /** Return the minimum item in the stack
    *
    * @return the minimum item in the stack
    */
  def min: Option[T] = ???

  /** A predicate to check if the stack is empty
    *
    * @return the true or false condition if the stack is empty
    */
  def isEmpty: Boolean = ???
  
}