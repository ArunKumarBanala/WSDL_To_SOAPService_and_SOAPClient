/**
 * PersonServiceImplSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arun.jaxws.service;

public class PersonServiceImplSoapBindingSkeleton implements com.arun.jaxws.service.PersonServiceImpl, org.apache.axis.wsdl.Skeleton {
    private com.arun.jaxws.service.PersonServiceImpl impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "p"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.jaxws.arun.com", "Person"), com.arun.jaxws.beans.Person.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addPerson", _params, new javax.xml.namespace.QName("http://service.jaxws.arun.com", "addPersonReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "addPerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addPerson") == null) {
            _myOperations.put("addPerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addPerson")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deletePerson", _params, new javax.xml.namespace.QName("http://service.jaxws.arun.com", "deletePersonReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "deletePerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deletePerson") == null) {
            _myOperations.put("deletePerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deletePerson")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPerson", _params, new javax.xml.namespace.QName("http://service.jaxws.arun.com", "getPersonReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.jaxws.arun.com", "Person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "getPerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPerson") == null) {
            _myOperations.put("getPerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPerson")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getAllPersons", _params, new javax.xml.namespace.QName("http://service.jaxws.arun.com", "getAllPersonsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.jaxws.arun.com", "Person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://service.jaxws.arun.com", "getAllPersons"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAllPersons") == null) {
            _myOperations.put("getAllPersons", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAllPersons")).add(_oper);
    }

    public PersonServiceImplSoapBindingSkeleton() {
        this.impl = new com.arun.jaxws.service.PersonServiceImplSoapBindingImpl();
    }

    public PersonServiceImplSoapBindingSkeleton(com.arun.jaxws.service.PersonServiceImpl impl) {
        this.impl = impl;
    }
    public boolean addPerson(com.arun.jaxws.beans.Person p) throws java.rmi.RemoteException
    {
        boolean ret = impl.addPerson(p);
        return ret;
    }

    public boolean deletePerson(int id) throws java.rmi.RemoteException
    {
        boolean ret = impl.deletePerson(id);
        return ret;
    }

    public com.arun.jaxws.beans.Person getPerson(int id) throws java.rmi.RemoteException
    {
        com.arun.jaxws.beans.Person ret = impl.getPerson(id);
        return ret;
    }

    public com.arun.jaxws.beans.Person[] getAllPersons() throws java.rmi.RemoteException
    {
        com.arun.jaxws.beans.Person[] ret = impl.getAllPersons();
        return ret;
    }

}
