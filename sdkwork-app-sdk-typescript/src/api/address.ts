import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListUserAddressVO, PlusApiResultUserAddressVO, PlusApiResultVoid, UserAddressCreateForm, UserAddressUpdateForm } from '../types';


export class AddressApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取地址详情 */
  async getAddressDetail(addressId: string | number): Promise<PlusApiResultUserAddressVO> {
    return this.client.get<PlusApiResultUserAddressVO>(appApiPath(`/user/address/${addressId}`));
  }

/** 更新地址 */
  async updateAddress(addressId: string | number, body: UserAddressUpdateForm): Promise<PlusApiResultUserAddressVO> {
    return this.client.put<PlusApiResultUserAddressVO>(appApiPath(`/user/address/${addressId}`), body);
  }

/** 删除地址 */
  async deleteAddress(addressId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/user/address/${addressId}`));
  }

/** 设置默认地址 */
  async setDefault(addressId: string | number): Promise<PlusApiResultUserAddressVO> {
    return this.client.put<PlusApiResultUserAddressVO>(appApiPath(`/user/address/${addressId}/default`));
  }

/** 获取地址列表 */
  async listAddresses(): Promise<PlusApiResultListUserAddressVO> {
    return this.client.get<PlusApiResultListUserAddressVO>(appApiPath(`/user/address`));
  }

/** 创建地址 */
  async createAddress(body: UserAddressCreateForm): Promise<PlusApiResultUserAddressVO> {
    return this.client.post<PlusApiResultUserAddressVO>(appApiPath(`/user/address`), body);
  }

/** 获取默认地址 */
  async getDefault(): Promise<PlusApiResultUserAddressVO> {
    return this.client.get<PlusApiResultUserAddressVO>(appApiPath(`/user/address/default`));
  }
}

export function createAddressApi(client: HttpClient): AddressApi {
  return new AddressApi(client);
}
