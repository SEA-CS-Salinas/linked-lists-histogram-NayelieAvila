//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nayelie

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

   public HistoList()
   {
      front = null;
   }

   public void addLetter(char let)
   {
      if (front == null)
      {
         front = new HistoNode(let, 1, null);
         return;
      }
      
      HistoNode current = front;
      HistoNode previous = null;
      
      while (current != null)
      {
         if (current.getLetter() == let)
         {
            current.setLetterCount(current.getLetterCount() + 1);
            return;
         }
         previous = current;
         current = current.getNext();
      }
      
      front = new HistoNode(let, 1, front);
   }

   public String toString()
   {
      StringBuilder output = new StringBuilder();
      HistoNode current = front;
      
      while (current != null)
      {
         output.append(current.getLetter()).append(" - ").append(current.getLetterCount()).append("     ");
         current = current.getNext();
      }
      
      return output.toString().trim();
   }
}
