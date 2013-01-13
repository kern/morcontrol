/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bhrobotics.morcontrol.io;

import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class Address implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("Address");

  private static final TField MOD_FIELD_DESC = new TField("mod", TType.I32, (short)1);
  private static final TField CHANNEL_FIELD_DESC = new TField("channel", TType.I32, (short)2);

  private int mod;
  private int channel;

  // isset id assignments
  private static final int __MOD_ISSET_ID = 0;
  private static final int __CHANNEL_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public Address() {
  }

  public Address(
    int mod,
    int channel)
  {
    this();
    this.mod = mod;
    setModIsSet(true);
    this.channel = channel;
    setChannelIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Address(Address other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.mod = other.mod;
    this.channel = other.channel;
  }

  public Address deepCopy() {
    return new Address(this);
  }

  public void clear() {
    setModIsSet(false);
    this.mod = 0;
    setChannelIsSet(false);
    this.channel = 0;
  }

  public int getMod() {
    return this.mod;
  }

  public void setMod(int mod) {
    this.mod = mod;
    setModIsSet(true);
  }

  public void unsetMod() {
    __isset_vector[__MOD_ISSET_ID] = false;
  }

  /** Returns true if field mod is set (has been assigned a value) and false otherwise */
  public boolean isSetMod() {
    return __isset_vector[__MOD_ISSET_ID];
  }

  public void setModIsSet(boolean value) {
    __isset_vector[__MOD_ISSET_ID] = value;
  }

  public int getChannel() {
    return this.channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
    setChannelIsSet(true);
  }

  public void unsetChannel() {
    __isset_vector[__CHANNEL_ISSET_ID] = false;
  }

  /** Returns true if field channel is set (has been assigned a value) and false otherwise */
  public boolean isSetChannel() {
    return __isset_vector[__CHANNEL_ISSET_ID];
  }

  public void setChannelIsSet(boolean value) {
    __isset_vector[__CHANNEL_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Address)
      return this.equals((Address)that);
    return false;
  }

  public boolean equals(Address that) {
    if (that == null)
      return false;

    boolean this_present_mod = true;
    boolean that_present_mod = true;
    if (this_present_mod || that_present_mod) {
      if (!(this_present_mod && that_present_mod))
        return false;
      if (this.mod != that.mod)
        return false;
    }

    boolean this_present_channel = true;
    boolean that_present_channel = true;
    if (this_present_channel || that_present_channel) {
      if (!(this_present_channel && that_present_channel))
        return false;
      if (this.channel != that.channel)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    Address other = (Address)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMod(), other.isSetMod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMod()) {
      lastComparison = TBaseHelper.compareTo(this.mod, other.mod);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetChannel(), other.isSetChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannel()) {
      lastComparison = TBaseHelper.compareTo(this.channel, other.channel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // MOD
          if (field.type == TType.I32) {
            this.mod = iprot.readI32();
            setModIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CHANNEL
          if (field.type == TType.I32) {
            this.channel = iprot.readI32();
            setChannelIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(MOD_FIELD_DESC);
    oprot.writeI32(this.mod);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
    oprot.writeI32(this.channel);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("Address(");
    boolean first = true;

    sb.append("mod:");
    sb.append(this.mod);
    first = false;
    if (!first) sb.append(", ");
    sb.append("channel:");
    sb.append(this.channel);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
