using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PartnerApi
    {
        private readonly HttpClient _client;

        public PartnerApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取合作伙伴详情
        /// </summary>
        public async Task<PlusApiResultPartnerDetailVO?> GetPartnerAsync(string partnerId)
        {
            return await _client.GetAsync<PlusApiResultPartnerDetailVO>(ApiPaths.AppPath($"/partner/{partnerId}"));
        }

        /// <summary>
        /// 更新合作伙伴
        /// </summary>
        public async Task<PlusApiResultPartnerVO?> UpdatePartnerAsync(string partnerId, PartnerUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultPartnerVO>(ApiPaths.AppPath($"/partner/{partnerId}"), body);
        }

        /// <summary>
        /// 删除合作伙伴
        /// </summary>
        public async Task<PlusApiResultVoid?> DeletePartnerAsync(string partnerId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/partner/{partnerId}"));
        }

        /// <summary>
        /// 申请成为合作伙伴
        /// </summary>
        public async Task<PlusApiResultPartnerVO?> CreatePartnerAsync(PartnerCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPartnerVO>(ApiPaths.AppPath("/partner"), body);
        }

        /// <summary>
        /// 提现佣金
        /// </summary>
        public async Task<PlusApiResultVoid?> WithdrawCommissionAsync(string partnerId, CommissionForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/partner/{partnerId}/withdraw"), body);
        }

        /// <summary>
        /// 审批拒绝
        /// </summary>
        public async Task<PlusApiResultVoid?> RejectAsync(string partnerId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/partner/{partnerId}/reject"), null);
        }

        /// <summary>
        /// 添加佣金
        /// </summary>
        public async Task<PlusApiResultVoid?> AddCommissionAsync(string partnerId, CommissionForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/partner/{partnerId}/commission"), body);
        }

        /// <summary>
        /// 审批通过
        /// </summary>
        public async Task<PlusApiResultVoid?> ApproveAsync(string partnerId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/partner/{partnerId}/approve"), null);
        }

        /// <summary>
        /// 获取下级合作伙伴
        /// </summary>
        public async Task<PlusApiResultPagePartnerVO?> GetSubordinatesAsync(string partnerId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePartnerVO>(ApiPaths.AppPath($"/partner/subordinates/{partnerId}"), query);
        }

        /// <summary>
        /// 获取合作伙伴统计
        /// </summary>
        public async Task<PlusApiResultPartnerStatisticsVO?> GetPartnerStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultPartnerStatisticsVO>(ApiPaths.AppPath("/partner/statistics"));
        }

        /// <summary>
        /// 搜索合作伙伴
        /// </summary>
        public async Task<PlusApiResultPagePartnerVO?> SearchPartnersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePartnerVO>(ApiPaths.AppPath("/partner/search"), query);
        }

        /// <summary>
        /// 获取我的合作伙伴信息
        /// </summary>
        public async Task<PlusApiResultPartnerDetailVO?> GetMyAsync()
        {
            return await _client.GetAsync<PlusApiResultPartnerDetailVO>(ApiPaths.AppPath("/partner/my"));
        }

        /// <summary>
        /// 根据推广码查询
        /// </summary>
        public async Task<PlusApiResultPartnerVO?> GetByPromotionCodeAsync(string promotionCode)
        {
            return await _client.GetAsync<PlusApiResultPartnerVO>(ApiPaths.AppPath($"/partner/code/{promotionCode}"));
        }
    }
}
