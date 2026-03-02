using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptCreateForm
    {
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public string? Description { get; set; }
        public int? CateId { get; set; }
        public int? Sort { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public string? Model { get; set; }
        public bool? IsPublic { get; set; }
    }
}
