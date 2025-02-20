/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyun.oss.model;

public class CreateBucketRequest extends GenericRequest {

    private String locationConstraint;
    private CannedAccessControlList cannedACL;
    private StorageClass storageClass;
    private DataRedundancyType dataRedundancyType;
    private String hnsStatus;
    private String resourceGroupId;
    private String xcType;

    public CreateBucketRequest(String bucketName) {
        super(bucketName);
        setLocationConstraint(null);
        setCannedACL(null);
    }

    /**
     * Gets the bucket's datacenter
     * 
     * @return Bucket's datacenter.
     */
    public String getLocationConstraint() {
        return locationConstraint;
    }

    /**
     * Sets the bucket's datacenter.
     * 
     * @param locationConstraint
     *            Bucket's datacenter.
     */
    public void setLocationConstraint(String locationConstraint) {
        this.locationConstraint = locationConstraint;
    }

    /**
     * Creates the instance with datacenter.
     * 
     * @param locationConstraint
     *            Bucket datacenter.
     */
    public CreateBucketRequest withLocationConstraint(String locationConstraint) {
        setLocationConstraint(locationConstraint);
        return this;
    }

    public CannedAccessControlList getCannedACL() {
        return cannedACL;
    }

    public void setCannedACL(CannedAccessControlList cannedACL) {
        this.cannedACL = cannedACL;
    }

    public StorageClass getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
    }

    public CreateBucketRequest withCannedACL(CannedAccessControlList cannedACL) {
        setCannedACL(cannedACL);
        return this;
    }

    public CreateBucketRequest withStorageType(StorageClass storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the bucket's data redundancy type.
     * If the storage class has not been specified, the creating opreation maybe failed.
     * 
     * @param dataRedundancyType
     *            The Bucketdata redundancy type.
     */
    public void setDataRedundancyType(DataRedundancyType dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
    }

    /**
     * Creates the instance with data redundancy type.
     * If the storage class has not been specified, the creating opreation maybe failed.
     * 
     * @param dataRedundancyType
     *            The Bucketdata redundancy type.
     */
    public CreateBucketRequest withDataRedundancyType(DataRedundancyType dataRedundancyType) {
        setDataRedundancyType(dataRedundancyType);
        return this;
    }

    /**
     * Gets the bucket's data redundancy type.
     */
    public DataRedundancyType getDataRedundancyType() {
        return dataRedundancyType;
    }

    /**
     * Gets hierarchical namespace status.
     */
    public String getHnsStatus() {
        return hnsStatus;
    }

    /**
     * Sets hierarchical namespace status.
     *
     * @param hnsStatus
     *              The hierarchical namespace status.
     */
    public void setHnsStatus(String hnsStatus) {
        this.hnsStatus = hnsStatus;
    }

    /**
     * Sets hierarchical namespace status.
     *
     * @param hnsStatus
     *              The hierarchical namespace status.
     */
    public void setHnsStatus(HnsStatus hnsStatus) {
        this.hnsStatus = hnsStatus.toString();
    }

    /**
     * Creates the instance with hierarchical namespace status.
     * @param hnsStatus
     *              The hierarchical namespace status.
     */
    public CreateBucketRequest withHnsStatus(String hnsStatus) {
        this.setHnsStatus(hnsStatus);
        return this;
    }

    /**
     * Creates the instance with hierarchical namespace status.
     * @param hnsStatus
     *              The hierarchical namespace status.
     */
    public CreateBucketRequest withHnsStatus(HnsStatus hnsStatus) {
        this.setHnsStatus(hnsStatus);
        return this;
    }

    /**
     * Gets the resouce group id.
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * Sets the resouce group id.
     * @param resourceGroupId
     *              The id of resouce group.
     */
    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    /**
     * Creates the instance with resouce group id.
     * @param resourceGroupId
     *              The id of resouce group.
     */
    public CreateBucketRequest withResourceGroupId(String resourceGroupId) {
        this.setResourceGroupId(resourceGroupId);
        return this;
    }

    public String getXcType() {
        return xcType;
    }

    public void setXcType(String xcType) {
        this.xcType = xcType;
    }
}
