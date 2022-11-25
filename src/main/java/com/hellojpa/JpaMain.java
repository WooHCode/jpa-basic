package com.hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tr = em.getTransaction();
        tr.begin();


     try {
//      Member member = new Member();
//      member.setId(2L);
//      member.setName("helloB");

//      Member member = em.find(Member.class, 1L);
//      List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//      for (Member member : result) {
//       System.out.println("member.getName = " + member.getName());
//        }
//         Member member1 = new Member(30L, "A");
//         Member member2 = new Member(35L, "B");
//         em.persist(member1);
//         em.persist(member2);

      Member member = em.find(Member.class, 30L);
      member.setName("helloABC");

      System.out.println("==========================");



      tr.commit();
     } catch (Exception e) {
      tr.rollback();
     } finally {
      em.close();
     }

     emf.close();
    }
}