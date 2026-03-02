import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultInteger, PlusApiResultListProductVO, PlusApiResultListSkuVO, PlusApiResultPageProductVO, PlusApiResultProductDetailVO, PlusApiResultProductStatisticsVO, PlusApiResultProductVO } from '../types';


export class ProductsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取商品列表 */
  async getProducts(params?: QueryParams): Promise<PlusApiResultPageProductVO> {
    return this.client.get<PlusApiResultPageProductVO>(appApiPath(`/products`), params);
  }

/** 获取商品详情 */
  async getProductDetail(productId: string | number): Promise<PlusApiResultProductDetailVO> {
    return this.client.get<PlusApiResultProductDetailVO>(appApiPath(`/products/${productId}`));
  }

/** 获取商品库存 */
  async getProductStock(productId: string | number): Promise<PlusApiResultInteger> {
    return this.client.get<PlusApiResultInteger>(appApiPath(`/products/${productId}/stock`));
  }

/** 获取商品统计 */
  async getProductStatistics(productId: string | number): Promise<PlusApiResultProductStatisticsVO> {
    return this.client.get<PlusApiResultProductStatisticsVO>(appApiPath(`/products/${productId}/statistics`));
  }

/** 获取商品SKU列表 */
  async getProductSkus(productId: string | number, params?: QueryParams): Promise<PlusApiResultListSkuVO> {
    return this.client.get<PlusApiResultListSkuVO>(appApiPath(`/products/${productId}/skus`), params);
  }

/** 检查商品库存 */
  async checkProductStock(productId: string | number, params?: QueryParams): Promise<PlusApiResultBoolean> {
    return this.client.get<PlusApiResultBoolean>(appApiPath(`/products/${productId}/check-stock`), params);
  }

/** 搜索商品 */
  async search(params?: QueryParams): Promise<PlusApiResultPageProductVO> {
    return this.client.get<PlusApiResultPageProductVO>(appApiPath(`/products/search`), params);
  }

/** 获取最新商品 */
  async getLatest(params?: QueryParams): Promise<PlusApiResultListProductVO> {
    return this.client.get<PlusApiResultListProductVO>(appApiPath(`/products/latest`), params);
  }

/** 获取热门商品 */
  async getHot(params?: QueryParams): Promise<PlusApiResultListProductVO> {
    return this.client.get<PlusApiResultListProductVO>(appApiPath(`/products/hot`), params);
  }

/** 按编码获取商品 */
  async getProductByCode(code: string | number): Promise<PlusApiResultProductVO> {
    return this.client.get<PlusApiResultProductVO>(appApiPath(`/products/code/${code}`));
  }

/** 按分类获取商品 */
  async getProductsByCategory(categoryId: string | number, params?: QueryParams): Promise<PlusApiResultPageProductVO> {
    return this.client.get<PlusApiResultPageProductVO>(appApiPath(`/products/category/${categoryId}`), params);
  }
}

export function createProductsApi(client: HttpClient): ProductsApi {
  return new ProductsApi(client);
}
