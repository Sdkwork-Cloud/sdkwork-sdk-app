using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SoundEffectCategoriesQueryForm
    {
        public string? ParentCategory { get; set; }
        public string? Language { get; set; }
        public bool? IncludeSubcategories { get; set; }
    }
}
