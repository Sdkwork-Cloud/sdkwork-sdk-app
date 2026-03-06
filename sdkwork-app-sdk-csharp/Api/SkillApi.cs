using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SkillApi
    {
        private readonly HttpClient _client;

        public SkillApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get skill detail
        /// </summary>
        public async Task<PlusApiResultSkillVO?> DetailAsync(string skillId)
        {
            return await _client.GetAsync<PlusApiResultSkillVO>(ApiPaths.AppPath($"/skills/{skillId}"));
        }

        /// <summary>
        /// Update skill
        /// </summary>
        public async Task<PlusApiResultSkillVO?> UpdateAsync(string skillId, SkillSaveForm body)
        {
            return await _client.PutAsync<PlusApiResultSkillVO>(ApiPaths.AppPath($"/skills/{skillId}"), body);
        }

        /// <summary>
        /// Update user skill config
        /// </summary>
        public async Task<PlusApiResultUserSkillVO?> UpdateConfigAsync(string skillId, SkillConfigUpdateForm? body = null)
        {
            return await _client.PutAsync<PlusApiResultUserSkillVO>(ApiPaths.AppPath($"/skills/{skillId}/config"), body);
        }

        /// <summary>
        /// List market skills
        /// </summary>
        public async Task<PlusApiResultPageSkillVO?> ListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageSkillVO>(ApiPaths.AppPath("/skills"), query);
        }

        /// <summary>
        /// Create skill
        /// </summary>
        public async Task<PlusApiResultSkillVO?> CreateAsync(SkillSaveForm body)
        {
            return await _client.PostAsync<PlusApiResultSkillVO>(ApiPaths.AppPath("/skills"), body);
        }

        /// <summary>
        /// Submit skill for review
        /// </summary>
        public async Task<PlusApiResultSkillVO?> SubmitReviewAsync(string skillId)
        {
            return await _client.PostAsync<PlusApiResultSkillVO>(ApiPaths.AppPath($"/skills/{skillId}/submit-review"), null);
        }

        /// <summary>
        /// Publish skill to market
        /// </summary>
        public async Task<PlusApiResultSkillVO?> PublishAsync(string skillId)
        {
            return await _client.PostAsync<PlusApiResultSkillVO>(ApiPaths.AppPath($"/skills/{skillId}/publish"), null);
        }

        /// <summary>
        /// Offline skill from market
        /// </summary>
        public async Task<PlusApiResultSkillVO?> OfflineAsync(string skillId)
        {
            return await _client.PostAsync<PlusApiResultSkillVO>(ApiPaths.AppPath($"/skills/{skillId}/offline"), null);
        }

        /// <summary>
        /// Enable skill for current user
        /// </summary>
        public async Task<PlusApiResultUserSkillVO?> EnableAsync(string skillId)
        {
            return await _client.PostAsync<PlusApiResultUserSkillVO>(ApiPaths.AppPath($"/skills/{skillId}/enable"), null);
        }

        /// <summary>
        /// Disable skill for current user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DisableAsync(string skillId)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/skills/{skillId}/disable"), null);
        }

        /// <summary>
        /// List skill packages
        /// </summary>
        public async Task<PlusApiResultListSkillPackageVO?> ListPackagesAsync()
        {
            return await _client.GetAsync<PlusApiResultListSkillPackageVO>(ApiPaths.AppPath("/skills/packages"));
        }

        /// <summary>
        /// List my installed skills
        /// </summary>
        public async Task<PlusApiResultListUserSkillVO?> ListMineAsync()
        {
            return await _client.GetAsync<PlusApiResultListUserSkillVO>(ApiPaths.AppPath("/skills/my"));
        }

        /// <summary>
        /// List skill categories
        /// </summary>
        public async Task<PlusApiResultListSkillCategoryVO?> ListCategoriesAsync()
        {
            return await _client.GetAsync<PlusApiResultListSkillCategoryVO>(ApiPaths.AppPath("/skills/categories"));
        }
    }
}
