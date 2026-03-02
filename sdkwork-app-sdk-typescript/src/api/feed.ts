import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultFeedItemVO, PlusApiResultListFeedItemVO } from '../types';


export class FeedApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 取消点赞Feed */
  async unlike(id: string | number): Promise<PlusApiResultFeedItemVO> {
    return this.client.post<PlusApiResultFeedItemVO>(appApiPath(`/feeds/unlike/${id}`));
  }

/** 取消收藏Feed */
  async uncollect(id: string | number): Promise<PlusApiResultFeedItemVO> {
    return this.client.post<PlusApiResultFeedItemVO>(appApiPath(`/feeds/uncollect/${id}`));
  }

/** 分享Feed */
  async share(id: string | number): Promise<PlusApiResultFeedItemVO> {
    return this.client.post<PlusApiResultFeedItemVO>(appApiPath(`/feeds/share/${id}`));
  }

/** 点赞Feed */
  async like(id: string | number): Promise<PlusApiResultFeedItemVO> {
    return this.client.post<PlusApiResultFeedItemVO>(appApiPath(`/feeds/like/${id}`));
  }

/** 收藏Feed */
  async collect(id: string | number, params?: QueryParams): Promise<PlusApiResultFeedItemVO> {
    return this.client.post<PlusApiResultFeedItemVO>(appApiPath(`/feeds/collect/${id}`), undefined, params);
  }

/** 获取置顶Feed */
  async getTopFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/top`), params);
  }

/** 搜索Feed */
  async searchFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/search`), params);
  }

/** 获取推荐Feed */
  async getRecommendedFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/recommend`), params);
  }

/** 获取最多浏览Feed */
  async getMostViewedFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/most-viewed`), params);
  }

/** 获取最多点赞Feed */
  async getMostLikedFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/most-liked`), params);
  }

/** 获取Feed列表 */
  async getFeedList(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/list`), params);
  }

/** 获取热门Feed */
  async getHotFeeds(params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/hot`), params);
  }

/** 获取Feed详情 */
  async getFeedDetail(id: string | number): Promise<PlusApiResultFeedItemVO> {
    return this.client.get<PlusApiResultFeedItemVO>(appApiPath(`/feeds/detail/${id}`));
  }

/** 检查收藏状态 */
  async checkCollected(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.get<PlusApiResultBoolean>(appApiPath(`/feeds/check-collected/${id}`));
  }

/** 获取分类Feed */
  async getFeedsByCategory(categoryId: string | number, params?: QueryParams): Promise<PlusApiResultListFeedItemVO> {
    return this.client.get<PlusApiResultListFeedItemVO>(appApiPath(`/feeds/category/${categoryId}`), params);
  }
}

export function createFeedApi(client: HttpClient): FeedApi {
  return new FeedApi(client);
}
