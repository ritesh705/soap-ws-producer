/*
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.19 at 06:40:22 PM IST 
//


package com.ritesh.soapws.model;

import javax.xml.bind.annotation.*;


*/
/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Student" type="{http://www.ritesh.com/model}Student"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 *//*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "StudentDetailsResponse")
public class StudentDetailsResponse {

    @XmlElement(name = "Student", required = true)
    protected Student student;

    */
/**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     *//*

    public Student getStudent() {
        return student;
    }

    */
/**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     *//*

    public void setStudent(Student value) {
        this.student = value;
    }

}
*/