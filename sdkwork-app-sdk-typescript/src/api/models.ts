import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GetModelPricesRequest, PlusApiResultListModelPriceVO, PlusApiResultListModelTypeVO, PlusApiResultListString, PlusApiResultModelInfoDetailVO, PlusApiResultModelPriceVO, PlusApiResultModelStatisticsVO, PlusApiResultPageModelInfoVO } from '../types';


export class ModelsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 批量获取模型价格 */
  async getModelPrices(body: GetModelPricesRequest): Promise<PlusApiResultListModelPriceVO> {
    return this.client.post<PlusApiResultListModelPriceVO>(appApiPath(`/models/prices/batch`), body);
  }

/** 获取模型详情 */
  async getModelById(modelId: string | number): Promise<PlusApiResultModelInfoDetailVO> {
    return this.client.get<PlusApiResultModelInfoDetailVO>(appApiPath(`/models/${modelId}`));
  }

/** 获取模型类型列表 */
  async getModelTypes(): Promise<PlusApiResultListModelTypeVO> {
    return this.client.get<PlusApiResultListModelTypeVO>(appApiPath(`/models/types`));
  }

/** 获取类型模型列表 */
  async getModelsByType(modelType: string | number, params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/type/${modelType}`), params);
  }

/** 获取模型统计 */
  async getModelStatistics(): Promise<PlusApiResultModelStatisticsVO> {
    return this.client.get<PlusApiResultModelStatisticsVO>(appApiPath(`/models/statistics`));
  }

/** 搜索模型 */
  async search(params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/search`), params);
  }

/** 获取模型价格 */
  async getModelPrice(model: string | number): Promise<PlusApiResultModelPriceVO> {
    return this.client.get<PlusApiResultModelPriceVO>(appApiPath(`/models/price/${model}`));
  }

/** 获取热门模型 */
  async getPopular(params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/popular`), params);
  }

/** 获取系列模型列表 */
  async getModelsByFamily(family: string | number, params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/family/${family}`), params);
  }

/** 获取所有模型系列 */
  async getAllFamilies(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(appApiPath(`/models/families`));
  }

/** 获取渠道模型列表 */
  async getModelsByChannel(channel: string | number, params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/channel/${channel}`), params);
  }

/** 根据模型标识获取详情 */
  async getModelBy(model: string | number): Promise<PlusApiResultModelInfoDetailVO> {
    return this.client.get<PlusApiResultModelInfoDetailVO>(appApiPath(`/models/by-model/${model}`));
  }

/** 获取活跃模型列表 */
  async getActive(params?: QueryParams): Promise<PlusApiResultPageModelInfoVO> {
    return this.client.get<PlusApiResultPageModelInfoVO>(appApiPath(`/models/active`), params);
  }
}

export function createModelsApi(client: HttpClient): ModelsApi {
  return new ModelsApi(client);
}
