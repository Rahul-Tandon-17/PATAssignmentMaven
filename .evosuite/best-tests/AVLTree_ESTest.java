/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 15 16:07:33 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1210));
      aVLTree0.insert(2629);
      aVLTree0.delete((-168));
      aVLTree0.insert((-232));
      aVLTree0.delete((-1599));
      aVLTree0.insert((-1));
      aVLTree0.delete((-4428));
      aVLTree0.insert((-1789));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete((-1789));
      aVLTree0.insert((-1599));
      aVLTree0.insert(2686);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.height = (-4428);
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.getRoot();
      aVLTree0.insert((-1789));
      aVLTree0.getRoot();
      int int0 = 3335;
      // Undeclared exception!
      try { 
        aVLTree0.insert(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      int int0 = 1;
      AVLTree.Node aVLTree_Node2 = aVLTree_Node0.right;
      aVLTree_Node0.right = null;
      aVLTree0.insert(1762);
      aVLTree_Node0.right = null;
      aVLTree0.insert(737);
      // Undeclared exception!
      try { 
        aVLTree0.delete(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.insert(630);
      aVLTree0.insert(1820);
      aVLTree0.insert(1);
      aVLTree0.insert(570);
      aVLTree0.find((-213));
      aVLTree0.delete(630);
      aVLTree0.find(0);
      aVLTree0.insert((-2227));
      aVLTree0.find(570);
      aVLTree0.height();
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.key = (-105);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.height();
      aVLTree_Node1.left = aVLTree_Node0;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.right.key = (-105);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.find((-1));
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2703);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.height();
      int int0 = (-1);
      aVLTree0.insert((-1));
      aVLTree0.delete((-2657));
      aVLTree0.insert((-1092));
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(2703);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1;
      aVLTree0.delete(1);
      int int1 = 1;
      aVLTree0.delete(1);
      aVLTree0.insert(1);
      int int2 = (-578);
      aVLTree0.insert((-578));
      aVLTree0.insert((-141));
      aVLTree0.insert(674);
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.insert(4);
      aVLTree0.delete((-578));
      aVLTree0.insert(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(447);
      int int0 = (-809);
      aVLTree0.insert((-809));
      aVLTree0.insert(1609);
      aVLTree0.insert(1);
      aVLTree0.delete(447);
      aVLTree0.delete(1);
      aVLTree0.delete(2040);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert((-816));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete((-584));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete(447);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node2.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node2);
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree_Node0.height = 0;
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.insert((-1987));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete(1);
      aVLTree_Node0.height = 1;
      aVLTree0.height();
      aVLTree0.find(3251);
      aVLTree_Node0.left = null;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert(1775);
      aVLTree0.insert((-1441));
      aVLTree0.insert((-2838));
      aVLTree0.find(0);
      aVLTree0.delete((-999));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(447);
      int int0 = (-809);
      aVLTree0.insert((-809));
      aVLTree0.insert(1609);
      aVLTree0.insert(1);
      aVLTree0.delete(447);
      aVLTree0.delete(1);
      int int1 = 0;
      aVLTree0.delete(2040);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert((-816));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete((-584));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete(447);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.delete(int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(3310);
      aVLTree0.delete(0);
      aVLTree0.insert(3310);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(3310);
      aVLTree0.insert(211);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.key = 3310;
      aVLTree0.delete(1);
      aVLTree0.delete((-1));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.find((-2271));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(5074);
      aVLTree0.find((-989));
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-407));
      int int0 = (-390);
      aVLTree0.insert((-390));
      int int1 = (-1);
      aVLTree0.insert((-1));
      aVLTree0.find((-1));
      aVLTree0.delete((-439));
      int int2 = 1;
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.find(1);
      aVLTree0.find(1);
      int int3 = (-2722);
      aVLTree0.insert((-2722));
      int int4 = 1;
      aVLTree0.delete(1);
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert((-1));
      aVLTree0.insert((-2429));
      aVLTree0.insert(2405);
      aVLTree0.delete(345);
      aVLTree0.find((-2429));
      assertEquals(1, aVLTree0.height());
  }
}
