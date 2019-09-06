/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class KeyExtent implements org.apache.thrift.TBase<KeyExtent, KeyExtent._Fields>, java.io.Serializable, Cloneable, Comparable<KeyExtent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeyExtent");

  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tableId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("endRow", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PREV_END_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("prevEndRow", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeyExtentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeyExtentTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String tableId; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endRow; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer prevEndRow; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_ID((short)1, "tableId"),
    END_ROW((short)2, "endRow"),
    PREV_END_ROW((short)3, "prevEndRow");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_ID
          return TABLE_ID;
        case 2: // END_ROW
          return END_ROW;
        case 3: // PREV_END_ROW
          return PREV_END_ROW;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tableId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_ROW, new org.apache.thrift.meta_data.FieldMetaData("endRow", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.PREV_END_ROW, new org.apache.thrift.meta_data.FieldMetaData("prevEndRow", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeyExtent.class, metaDataMap);
  }

  public KeyExtent() {
  }

  public KeyExtent(
    java.lang.String tableId,
    java.nio.ByteBuffer endRow,
    java.nio.ByteBuffer prevEndRow)
  {
    this();
    this.tableId = tableId;
    this.endRow = org.apache.thrift.TBaseHelper.copyBinary(endRow);
    this.prevEndRow = org.apache.thrift.TBaseHelper.copyBinary(prevEndRow);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeyExtent(KeyExtent other) {
    if (other.isSetTableId()) {
      this.tableId = other.tableId;
    }
    if (other.isSetEndRow()) {
      this.endRow = org.apache.thrift.TBaseHelper.copyBinary(other.endRow);
    }
    if (other.isSetPrevEndRow()) {
      this.prevEndRow = org.apache.thrift.TBaseHelper.copyBinary(other.prevEndRow);
    }
  }

  public KeyExtent deepCopy() {
    return new KeyExtent(this);
  }

  @Override
  public void clear() {
    this.tableId = null;
    this.endRow = null;
    this.prevEndRow = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableId() {
    return this.tableId;
  }

  public KeyExtent setTableId(@org.apache.thrift.annotation.Nullable java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  public void unsetTableId() {
    this.tableId = null;
  }

  /** Returns true if field tableId is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return this.tableId != null;
  }

  public void setTableIdIsSet(boolean value) {
    if (!value) {
      this.tableId = null;
    }
  }

  public byte[] getEndRow() {
    setEndRow(org.apache.thrift.TBaseHelper.rightSize(endRow));
    return endRow == null ? null : endRow.array();
  }

  public java.nio.ByteBuffer bufferForEndRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(endRow);
  }

  public KeyExtent setEndRow(byte[] endRow) {
    this.endRow = endRow == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(endRow.clone());
    return this;
  }

  public KeyExtent setEndRow(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endRow) {
    this.endRow = org.apache.thrift.TBaseHelper.copyBinary(endRow);
    return this;
  }

  public void unsetEndRow() {
    this.endRow = null;
  }

  /** Returns true if field endRow is set (has been assigned a value) and false otherwise */
  public boolean isSetEndRow() {
    return this.endRow != null;
  }

  public void setEndRowIsSet(boolean value) {
    if (!value) {
      this.endRow = null;
    }
  }

  public byte[] getPrevEndRow() {
    setPrevEndRow(org.apache.thrift.TBaseHelper.rightSize(prevEndRow));
    return prevEndRow == null ? null : prevEndRow.array();
  }

  public java.nio.ByteBuffer bufferForPrevEndRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(prevEndRow);
  }

  public KeyExtent setPrevEndRow(byte[] prevEndRow) {
    this.prevEndRow = prevEndRow == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(prevEndRow.clone());
    return this;
  }

  public KeyExtent setPrevEndRow(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer prevEndRow) {
    this.prevEndRow = org.apache.thrift.TBaseHelper.copyBinary(prevEndRow);
    return this;
  }

  public void unsetPrevEndRow() {
    this.prevEndRow = null;
  }

  /** Returns true if field prevEndRow is set (has been assigned a value) and false otherwise */
  public boolean isSetPrevEndRow() {
    return this.prevEndRow != null;
  }

  public void setPrevEndRowIsSet(boolean value) {
    if (!value) {
      this.prevEndRow = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((java.lang.String)value);
      }
      break;

    case END_ROW:
      if (value == null) {
        unsetEndRow();
      } else {
        if (value instanceof byte[]) {
          setEndRow((byte[])value);
        } else {
          setEndRow((java.nio.ByteBuffer)value);
        }
      }
      break;

    case PREV_END_ROW:
      if (value == null) {
        unsetPrevEndRow();
      } else {
        if (value instanceof byte[]) {
          setPrevEndRow((byte[])value);
        } else {
          setPrevEndRow((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_ID:
      return getTableId();

    case END_ROW:
      return getEndRow();

    case PREV_END_ROW:
      return getPrevEndRow();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLE_ID:
      return isSetTableId();
    case END_ROW:
      return isSetEndRow();
    case PREV_END_ROW:
      return isSetPrevEndRow();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeyExtent)
      return this.equals((KeyExtent)that);
    return false;
  }

  public boolean equals(KeyExtent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (!this.tableId.equals(that.tableId))
        return false;
    }

    boolean this_present_endRow = true && this.isSetEndRow();
    boolean that_present_endRow = true && that.isSetEndRow();
    if (this_present_endRow || that_present_endRow) {
      if (!(this_present_endRow && that_present_endRow))
        return false;
      if (!this.endRow.equals(that.endRow))
        return false;
    }

    boolean this_present_prevEndRow = true && this.isSetPrevEndRow();
    boolean that_present_prevEndRow = true && that.isSetPrevEndRow();
    if (this_present_prevEndRow || that_present_prevEndRow) {
      if (!(this_present_prevEndRow && that_present_prevEndRow))
        return false;
      if (!this.prevEndRow.equals(that.prevEndRow))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableId()) ? 131071 : 524287);
    if (isSetTableId())
      hashCode = hashCode * 8191 + tableId.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndRow()) ? 131071 : 524287);
    if (isSetEndRow())
      hashCode = hashCode * 8191 + endRow.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrevEndRow()) ? 131071 : 524287);
    if (isSetPrevEndRow())
      hashCode = hashCode * 8191 + prevEndRow.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(KeyExtent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTableId()).compareTo(other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableId, other.tableId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndRow()).compareTo(other.isSetEndRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endRow, other.endRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrevEndRow()).compareTo(other.isSetPrevEndRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrevEndRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prevEndRow, other.prevEndRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyExtent(");
    boolean first = true;

    sb.append("tableId:");
    if (this.tableId == null) {
      sb.append("null");
    } else {
      sb.append(this.tableId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endRow:");
    if (this.endRow == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.endRow, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("prevEndRow:");
    if (this.prevEndRow == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.prevEndRow, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeyExtentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyExtentStandardScheme getScheme() {
      return new KeyExtentStandardScheme();
    }
  }

  private static class KeyExtentStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeyExtent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeyExtent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableId = iprot.readString();
              struct.setTableIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endRow = iprot.readBinary();
              struct.setEndRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PREV_END_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.prevEndRow = iprot.readBinary();
              struct.setPrevEndRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeyExtent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableId != null) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeString(struct.tableId);
        oprot.writeFieldEnd();
      }
      if (struct.endRow != null) {
        oprot.writeFieldBegin(END_ROW_FIELD_DESC);
        oprot.writeBinary(struct.endRow);
        oprot.writeFieldEnd();
      }
      if (struct.prevEndRow != null) {
        oprot.writeFieldBegin(PREV_END_ROW_FIELD_DESC);
        oprot.writeBinary(struct.prevEndRow);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeyExtentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyExtentTupleScheme getScheme() {
      return new KeyExtentTupleScheme();
    }
  }

  private static class KeyExtentTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeyExtent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeyExtent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTableId()) {
        optionals.set(0);
      }
      if (struct.isSetEndRow()) {
        optionals.set(1);
      }
      if (struct.isSetPrevEndRow()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableId()) {
        oprot.writeString(struct.tableId);
      }
      if (struct.isSetEndRow()) {
        oprot.writeBinary(struct.endRow);
      }
      if (struct.isSetPrevEndRow()) {
        oprot.writeBinary(struct.prevEndRow);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeyExtent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableId = iprot.readString();
        struct.setTableIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endRow = iprot.readBinary();
        struct.setEndRowIsSet(true);
      }
      if (incoming.get(2)) {
        struct.prevEndRow = iprot.readBinary();
        struct.setPrevEndRowIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

