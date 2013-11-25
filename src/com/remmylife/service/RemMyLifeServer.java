

/**
 * RemMyLifeServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.remmylife.service;

    /*
     *  RemMyLifeServer java interface
     */

    public interface RemMyLifeServer {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  unshareDiary(
         com.remmylife.service.UnshareDiary unshareDiary0

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param loginByName1
                
         */

         
                     public com.remmylife.service.LoginByNameResponse loginByName(

                        com.remmylife.service.LoginByName loginByName1)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param loginByName1
            
          */
        public void startloginByName(

            com.remmylife.service.LoginByName loginByName1,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param searchByTitle3
                
         */

         
                     public com.remmylife.service.SearchByTitleResponse searchByTitle(

                        com.remmylife.service.SearchByTitle searchByTitle3)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param searchByTitle3
            
          */
        public void startsearchByTitle(

            com.remmylife.service.SearchByTitle searchByTitle3,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDiaryList5
                
         */

         
                     public com.remmylife.service.GetDiaryListResponse getDiaryList(

                        com.remmylife.service.GetDiaryList getDiaryList5)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDiaryList5
            
          */
        public void startgetDiaryList(

            com.remmylife.service.GetDiaryList getDiaryList5,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getComment7
                
         */

         
                     public com.remmylife.service.GetCommentResponse getComment(

                        com.remmylife.service.GetComment getComment7)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getComment7
            
          */
        public void startgetComment(

            com.remmylife.service.GetComment getComment7,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteDiary9
                
         */

         
                     public com.remmylife.service.DeleteDiaryResponse deleteDiary(

                        com.remmylife.service.DeleteDiary deleteDiary9)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteDiary9
            
          */
        public void startdeleteDiary(

            com.remmylife.service.DeleteDiary deleteDiary9,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUser11
                
         */

         
                     public com.remmylife.service.GetUserResponse getUser(

                        com.remmylife.service.GetUser getUser11)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUser11
            
          */
        public void startgetUser(

            com.remmylife.service.GetUser getUser11,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  saveComment(
         com.remmylife.service.SaveComment saveComment13

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteUser14
                
         */

         
                     public com.remmylife.service.DeleteUserResponse deleteUser(

                        com.remmylife.service.DeleteUser deleteUser14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteUser14
            
          */
        public void startdeleteUser(

            com.remmylife.service.DeleteUser deleteUser14,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDiary16
                
         */

         
                     public com.remmylife.service.GetDiaryResponse getDiary(

                        com.remmylife.service.GetDiary getDiary16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDiary16
            
          */
        public void startgetDiary(

            com.remmylife.service.GetDiary getDiary16,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param saveDiary18
                
         */

         
                     public com.remmylife.service.SaveDiaryResponse saveDiary(

                        com.remmylife.service.SaveDiary saveDiary18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param saveDiary18
            
          */
        public void startsaveDiary(

            com.remmylife.service.SaveDiary saveDiary18,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param searchByType20
                
         */

         
                     public com.remmylife.service.SearchByTypeResponse searchByType(

                        com.remmylife.service.SearchByType searchByType20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param searchByType20
            
          */
        public void startsearchByType(

            com.remmylife.service.SearchByType searchByType20,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  shareDiary(
         com.remmylife.service.ShareDiary shareDiary22

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param searchByDate23
                
         */

         
                     public com.remmylife.service.SearchByDateResponse searchByDate(

                        com.remmylife.service.SearchByDate searchByDate23)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param searchByDate23
            
          */
        public void startsearchByDate(

            com.remmylife.service.SearchByDate searchByDate23,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sortByDate25
                
         */

         
                     public com.remmylife.service.SortByDateResponse sortByDate(

                        com.remmylife.service.SortByDate sortByDate25)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sortByDate25
            
          */
        public void startsortByDate(

            com.remmylife.service.SortByDate sortByDate25,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param saveUser27
                
         */

         
                     public com.remmylife.service.SaveUserResponse saveUser(

                        com.remmylife.service.SaveUser saveUser27)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param saveUser27
            
          */
        public void startsaveUser(

            com.remmylife.service.SaveUser saveUser27,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param searchByContent29
                
         */

         
                     public com.remmylife.service.SearchByContentResponse searchByContent(

                        com.remmylife.service.SearchByContent searchByContent29)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param searchByContent29
            
          */
        public void startsearchByContent(

            com.remmylife.service.SearchByContent searchByContent29,

            final com.remmylife.service.RemMyLifeServerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    