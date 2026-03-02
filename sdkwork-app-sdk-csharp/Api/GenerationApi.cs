using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class GenerationApi
    {
        private readonly HttpClient _client;

        public GenerationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Enhance generation prompt
        /// </summary>
        public async Task<PlusApiResultPromptEnhanceResponse?> EnhanceGenerationPromptAsync(PromptEnhanceRequest body)
        {
            return await _client.PostAsync<PlusApiResultPromptEnhanceResponse>(ApiPaths.AppPath("/generation/prompt/enhance"), body);
        }
    }
}
