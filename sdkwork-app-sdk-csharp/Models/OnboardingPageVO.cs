using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OnboardingPageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PageId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public List<string>? Images { get; set; }
        public List<string>? Buttons { get; set; }
        public string? BackgroundColor { get; set; }
        public string? TextColor { get; set; }
        public bool? IsActive { get; set; }
        public int? Order { get; set; }
    }
}
