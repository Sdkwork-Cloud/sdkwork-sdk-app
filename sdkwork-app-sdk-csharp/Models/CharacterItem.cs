using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterItem
    {
        public string? Description { get; set; }
        public string? Style { get; set; }
        public string? Pose { get; set; }
    }
}
