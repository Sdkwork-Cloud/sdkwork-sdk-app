import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultQrCodeStatusVO, PlusApiResultQrCodeVO, PlusApiResultVoid, QrCodeConfirmForm } from '../types';


export class QrApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 生成登录二维码 */
  async generateQrCode(): Promise<PlusApiResultQrCodeVO> {
    return this.client.post<PlusApiResultQrCodeVO>(appApiPath(`/auth/qr/generate`));
  }

/** 确认二维码登录 */
  async confirmQrCodeLogin(body: QrCodeConfirmForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/auth/qr/confirm`), body);
  }

/** 检查二维码状态 */
  async checkQrCodeStatus(qrKey: string | number): Promise<PlusApiResultQrCodeStatusVO> {
    return this.client.get<PlusApiResultQrCodeStatusVO>(appApiPath(`/auth/qr/status/${qrKey}`));
  }
}

export function createQrApi(client: HttpClient): QrApi {
  return new QrApi(client);
}
