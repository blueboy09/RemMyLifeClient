
/**
 * ManagerServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.remmylife.service;

    /**
     *  ManagerServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ManagerServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ManagerServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ManagerServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for loginByName method
            * override this method for handling normal response from loginByName operation
            */
           public void receiveResultloginByName(
                    com.remmylife.service.LoginByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginByName operation
           */
            public void receiveErrorloginByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for searchByTitle method
            * override this method for handling normal response from searchByTitle operation
            */
           public void receiveResultsearchByTitle(
                    com.remmylife.service.SearchByTitleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchByTitle operation
           */
            public void receiveErrorsearchByTitle(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDiaryList method
            * override this method for handling normal response from getDiaryList operation
            */
           public void receiveResultgetDiaryList(
                    com.remmylife.service.GetDiaryListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiaryList operation
           */
            public void receiveErrorgetDiaryList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getComment method
            * override this method for handling normal response from getComment operation
            */
           public void receiveResultgetComment(
                    com.remmylife.service.GetCommentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getComment operation
           */
            public void receiveErrorgetComment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteDiary method
            * override this method for handling normal response from deleteDiary operation
            */
           public void receiveResultdeleteDiary(
                    com.remmylife.service.DeleteDiaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteDiary operation
           */
            public void receiveErrordeleteDiary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUser method
            * override this method for handling normal response from getUser operation
            */
           public void receiveResultgetUser(
                    com.remmylife.service.GetUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUser operation
           */
            public void receiveErrorgetUser(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for deleteUser method
            * override this method for handling normal response from deleteUser operation
            */
           public void receiveResultdeleteUser(
                    com.remmylife.service.DeleteUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteUser operation
           */
            public void receiveErrordeleteUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDiary method
            * override this method for handling normal response from getDiary operation
            */
           public void receiveResultgetDiary(
                    com.remmylife.service.GetDiaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiary operation
           */
            public void receiveErrorgetDiary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveDiary method
            * override this method for handling normal response from saveDiary operation
            */
           public void receiveResultsaveDiary(
                    com.remmylife.service.SaveDiaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveDiary operation
           */
            public void receiveErrorsaveDiary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for searchByType method
            * override this method for handling normal response from searchByType operation
            */
           public void receiveResultsearchByType(
                    com.remmylife.service.SearchByTypeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchByType operation
           */
            public void receiveErrorsearchByType(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for searchByDate method
            * override this method for handling normal response from searchByDate operation
            */
           public void receiveResultsearchByDate(
                    com.remmylife.service.SearchByDateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchByDate operation
           */
            public void receiveErrorsearchByDate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sortByDate method
            * override this method for handling normal response from sortByDate operation
            */
           public void receiveResultsortByDate(
                    com.remmylife.service.SortByDateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sortByDate operation
           */
            public void receiveErrorsortByDate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveUser method
            * override this method for handling normal response from saveUser operation
            */
           public void receiveResultsaveUser(
                    com.remmylife.service.SaveUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveUser operation
           */
            public void receiveErrorsaveUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for searchByContent method
            * override this method for handling normal response from searchByContent operation
            */
           public void receiveResultsearchByContent(
                    com.remmylife.service.SearchByContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchByContent operation
           */
            public void receiveErrorsearchByContent(java.lang.Exception e) {
            }
                


    }
    