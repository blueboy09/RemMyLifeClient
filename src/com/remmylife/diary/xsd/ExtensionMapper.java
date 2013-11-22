
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.remmylife.diary.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "Comment".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.Comment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "DiaryType".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.DiaryType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "Sex".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.Sex.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "Weather".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.Weather.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://diary.remmylife.com/xsd".equals(namespaceURI) &&
                  "Diary".equals(typeName)){
                   
                            return  com.remmylife.diary.xsd.Diary.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    