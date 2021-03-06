// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/dystopia/proto/Messages.proto

package com.dystopia.message;

public final class Messages {
  private Messages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TaskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.dystopia.message.Task)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
     */
    com.dystopia.message.Messages.Task.TaskType getType();
  }
  /**
   * Protobuf type {@code com.dystopia.message.Task}
   */
  public  static final class Task extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.dystopia.message.Task)
      TaskOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Task.newBuilder() to construct.
    private Task(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Task() {
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Task(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dystopia.message.Messages.internal_static_com_dystopia_message_Task_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dystopia.message.Messages.internal_static_com_dystopia_message_Task_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dystopia.message.Messages.Task.class, com.dystopia.message.Messages.Task.Builder.class);
    }

    /**
     * Protobuf enum {@code com.dystopia.message.Task.TaskType}
     */
    public enum TaskType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PUSH = 0;</code>
       */
      PUSH(0),
      /**
       * <code>PULL = 1;</code>
       */
      PULL(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>PUSH = 0;</code>
       */
      public static final int PUSH_VALUE = 0;
      /**
       * <code>PULL = 1;</code>
       */
      public static final int PULL_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static TaskType valueOf(int value) {
        return forNumber(value);
      }

      public static TaskType forNumber(int value) {
        switch (value) {
          case 0: return PUSH;
          case 1: return PULL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<TaskType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          TaskType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TaskType>() {
              public TaskType findValueByNumber(int number) {
                return TaskType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.dystopia.message.Messages.Task.getDescriptor().getEnumTypes().get(0);
      }

      private static final TaskType[] VALUES = values();

      public static TaskType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private TaskType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:com.dystopia.message.Task.TaskType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
     */
    public com.dystopia.message.Messages.Task.TaskType getType() {
      com.dystopia.message.Messages.Task.TaskType result = com.dystopia.message.Messages.Task.TaskType.valueOf(type_);
      return result == null ? com.dystopia.message.Messages.Task.TaskType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != com.dystopia.message.Messages.Task.TaskType.PUSH.getNumber()) {
        output.writeEnum(1, type_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.dystopia.message.Messages.Task.TaskType.PUSH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.dystopia.message.Messages.Task)) {
        return super.equals(obj);
      }
      com.dystopia.message.Messages.Task other = (com.dystopia.message.Messages.Task) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dystopia.message.Messages.Task parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dystopia.message.Messages.Task parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dystopia.message.Messages.Task parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dystopia.message.Messages.Task parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dystopia.message.Messages.Task parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dystopia.message.Messages.Task parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.dystopia.message.Messages.Task prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.dystopia.message.Task}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.dystopia.message.Task)
        com.dystopia.message.Messages.TaskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dystopia.message.Messages.internal_static_com_dystopia_message_Task_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dystopia.message.Messages.internal_static_com_dystopia_message_Task_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dystopia.message.Messages.Task.class, com.dystopia.message.Messages.Task.Builder.class);
      }

      // Construct using com.dystopia.message.Messages.Task.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dystopia.message.Messages.internal_static_com_dystopia_message_Task_descriptor;
      }

      public com.dystopia.message.Messages.Task getDefaultInstanceForType() {
        return com.dystopia.message.Messages.Task.getDefaultInstance();
      }

      public com.dystopia.message.Messages.Task build() {
        com.dystopia.message.Messages.Task result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dystopia.message.Messages.Task buildPartial() {
        com.dystopia.message.Messages.Task result = new com.dystopia.message.Messages.Task(this);
        result.type_ = type_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dystopia.message.Messages.Task) {
          return mergeFrom((com.dystopia.message.Messages.Task)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dystopia.message.Messages.Task other) {
        if (other == com.dystopia.message.Messages.Task.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dystopia.message.Messages.Task parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dystopia.message.Messages.Task) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
       */
      public com.dystopia.message.Messages.Task.TaskType getType() {
        com.dystopia.message.Messages.Task.TaskType result = com.dystopia.message.Messages.Task.TaskType.valueOf(type_);
        return result == null ? com.dystopia.message.Messages.Task.TaskType.UNRECOGNIZED : result;
      }
      /**
       * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
       */
      public Builder setType(com.dystopia.message.Messages.Task.TaskType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.com.dystopia.message.Task.TaskType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.dystopia.message.Task)
    }

    // @@protoc_insertion_point(class_scope:com.dystopia.message.Task)
    private static final com.dystopia.message.Messages.Task DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dystopia.message.Messages.Task();
    }

    public static com.dystopia.message.Messages.Task getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Task>
        PARSER = new com.google.protobuf.AbstractParser<Task>() {
      public Task parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Task(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Task> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Task> getParserForType() {
      return PARSER;
    }

    public com.dystopia.message.Messages.Task getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dystopia_message_Task_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dystopia_message_Task_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!com/dystopia/proto/Messages.proto\022\024com" +
      ".dystopia.message\"Y\n\004Task\0221\n\004type\030\001 \001(\0162" +
      "#.com.dystopia.message.Task.TaskType\"\036\n\010" +
      "TaskType\022\010\n\004PUSH\020\000\022\010\n\004PULL\020\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_dystopia_message_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dystopia_message_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dystopia_message_Task_descriptor,
        new java.lang.String[] { "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
