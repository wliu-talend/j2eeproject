/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Mon Nov 27 23:59:38 CST 2006 by MyEclipse Hibernate Tool.
 */
package edu.pm.vo;

import java.io.Serializable;

/**
 * A class that represents a row in the users table. 
 * You can customize the behavior of this class by editing the class, {@link Users()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractUsers 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Long id;

    /** The value of the simple loginName property. */
    private java.lang.String loginName;

    /** The value of the simple password property. */
    private java.lang.String password;

    /** The value of the simple userName property. */
    private java.lang.String userName;

    /** The value of the simple sex property. */
    private java.lang.String sex;

    /** The value of the simple email property. */
    private java.lang.String email;

    /** The value of the simple address property. */
    private java.lang.String address;

    /** The value of the simple phone property. */
    private java.lang.String phone;

    /** The value of the simple handset property. */
    private java.lang.String handset;

    /** The value of the simple isDeleted property. */
    private java.lang.String isDeleted;
    
    private java.lang.String isAdmin;

    /**
     * Simple constructor of AbstractUsers instances.
     */
    public AbstractUsers()
    {
    }

    /**
     * Constructor of AbstractUsers instances given a simple primary key.
     * @param id
     */
    public AbstractUsers(java.lang.Long id)
    {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Long
     */
    public java.lang.Long getId()
    {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Long id)
    {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * Return the value of the login_name column.
     * @return java.lang.String
     */
    public java.lang.String getLoginName()
    {
        return this.loginName;
    }

    /**
     * Set the value of the login_name column.
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName)
    {
        this.loginName = loginName;
    }

    /**
     * Return the value of the password column.
     * @return java.lang.String
     */
    public java.lang.String getPassword()
    {
        return this.password;
    }

    /**
     * Set the value of the password column.
     * @param password
     */
    public void setPassword(java.lang.String password)
    {
        this.password = password;
    }

    /**
     * Return the value of the user_name column.
     * @return java.lang.String
     */
    public java.lang.String getUserName()
    {
        return this.userName;
    }

    /**
     * Set the value of the user_name column.
     * @param userName
     */
    public void setUserName(java.lang.String userName)
    {
        this.userName = userName;
    }

    /**
     * Return the value of the sex column.
     * @return java.lang.String
     */
    public java.lang.String getSex()
    {
        return this.sex;
    }

    /**
     * Set the value of the sex column.
     * @param sex
     */
    public void setSex(java.lang.String sex)
    {
        this.sex = sex;
    }

    /**
     * Return the value of the email column.
     * @return java.lang.String
     */
    public java.lang.String getEmail()
    {
        return this.email;
    }

    /**
     * Set the value of the email column.
     * @param email
     */
    public void setEmail(java.lang.String email)
    {
        this.email = email;
    }

    /**
     * Return the value of the address column.
     * @return java.lang.String
     */
    public java.lang.String getAddress()
    {
        return this.address;
    }

    /**
     * Set the value of the address column.
     * @param address
     */
    public void setAddress(java.lang.String address)
    {
        this.address = address;
    }

    /**
     * Return the value of the phone column.
     * @return java.lang.String
     */
    public java.lang.String getPhone()
    {
        return this.phone;
    }

    /**
     * Set the value of the phone column.
     * @param phone
     */
    public void setPhone(java.lang.String phone)
    {
        this.phone = phone;
    }

    /**
     * Return the value of the handset column.
     * @return java.lang.String
     */
    public java.lang.String getHandset()
    {
        return this.handset;
    }

    /**
     * Set the value of the handset column.
     * @param handset
     */
    public void setHandset(java.lang.String handset)
    {
        this.handset = handset;
    }

    /**
     * Return the value of the is_deleted column.
     * @return java.lang.String
     */
    public java.lang.String getIsDeleted()
    {
        return this.isDeleted;
    }

    /**
     * Set the value of the is_deleted column.
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.String isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof Users))
            return false;
        Users that = (Users) rhs;
        if (this.getId() != null && that.getId() != null)
        {
            if (! this.getId().equals(that.getId()))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

	public java.lang.String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(java.lang.String isAdmin) {
		this.isAdmin = isAdmin;
	}
}