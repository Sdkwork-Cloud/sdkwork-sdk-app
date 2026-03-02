using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SoundEffectCategoriesVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<CategoryItem>? Categories { get; set; }
    }
}
