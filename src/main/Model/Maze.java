package main.Model;

public class Maze { // Contains the mazes within boolean arrays and a few helper methods.
	
	
	private boolean [][] _curMaze =
		{
				{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false},
				{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false},
				{false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false},
				{false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false},
				{false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false},
				{false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false},
				{false,  true, false,  true, false,  true, true, true, true, true, true, true, true, true, true, true, true, true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, true, true, true, true, true, true, true, true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  false,  false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, true, true, true, true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  false,  false,  true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, true, true, false,  true, false,  true, false,  true, false},
				{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false,  true, false},
				{false,  true, true,  true, true,  true, true, true, true,  true, true,  true, true,  true, true, true, true, true, true,  true, true,  true, false},
				{false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false},
				{false,  true, false,  true, true, true, true, false,  false,  true, false,  true, false,  true, true, true, true, true, true, true, false,  true, false},
				{false,  true, false,  false,  false,  false,  true, false,  false, true, false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  true, false},
				{false,  true, true, true, true, true, true, true,  true, false,  false,  true, true, true, true, true, true, true, true, true, true, true, false},
				{false,  false,  false,  false,  false,  false,  false,  false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false},
				};
	
	
	
	private boolean[][][] _mazeList = {
		{
			    // Easy Maze
			{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false},
			{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false},
			{false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false},
			{false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false},
			{false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false},
			{false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false},
			{false,  true, false,  true, false,  true, true, true, true, true, true, true, true, true, true, true, true, true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, true, true, true, true, true, true, true, true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  false,  false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, true, true, true, true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  false,  false,  true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, true, true, false,  true, false,  true, false,  true, false},
			{false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false,  true, false},
			{false,  true, true,  true, true,  true, true, true, true,  true, true,  true, true,  true, true, true, true, true, true,  true, true,  true, false},
			{false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false,  true, false,  false,  false,  false,  false,  true, false,  true, false},
			{false,  true, false,  true, true, true, true, false,  false,  true, false,  true, false,  true, true, true, true, true, true, true, false,  true, false},
			{false,  true, false,  false,  false,  false,  true, false,  false, true, false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  true, false},
			{false,  true, true, true, true, true, true, true,  true, false,  false,  true, true, true, true, true, true, true, true, true, true, true, false},
			{false,  false,  false,  false,  false,  false,  false,  false,  true, false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false,  false},
			},
				
		            { //Medium Maze
					{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
					{false, true, false, true, true, true, true, true, false, true, true, false, true, true, false, true, false, true, true, true, true, true, true, true, true, false, true, true, true, true, false},                                                                                                                                                                                                                                                                          
					{false, true, false, true, false, true, false, true, false, false, true, false, true, false, false, true, false, true, false, false, true, false, false, true, false, false, false, false, false, true, false},
					{false, true, true, true, true, true, false, true, true, true, true, true, true, false, true, true, true, true, false, true, true, true, false, true, true, false, true, true, true, true, false},
					{false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, true, false, false},
					{false, true, true, true, true, false, true, true, false, true, true, true, true, false, true, false, true, true, true, true, true, false, true, false, true, false, true, true, true, true, false},
					{false, false, false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false},
					{false, true, false, true, true, false, true, true, true, true, true, false, true, false, true, true, true, true, true, true, true, false, true, false, true, true, true, true, true, true, false},
					{false, true, false, true, false, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, true, false},
					{false, true, false, true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, false},
					{false, true, false, true, false, false, false, false, true, false, true, false, true, false, true, true, false, false, false, true, false, false, false, false, true, false, false, false, true, false, false},
					{false, true, true, true, true, true, true, false, true, false, true, true, true, false, true, true, false, true, true, true, true, true, false, true, true, true, false, true, true, true, false},
		            {false, true, true, true, false, true, true, false, true, false, true, true, true, false, true, true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, false},
					{false, true, true, true, false, true, true, false, true, false, true, true, true, false, false, false, false, true, true, true, true, true, false, true, true, true, false, true, true, true, false},
					{false, true, false, false, false, true, true, true, true, false, false, true, true, false, false, false, false, false, true, true, true, true, false, true, true, true, false, true, true, true, false, false},
					{false, true, false, true, true, true, true, false, false, false, false, true, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false},
					{false, true, false, true, false, false, false, false, false, true, false, false, false, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false},
					{false, true, false, false, false, false, true, true, true, true, false, true, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, true, false},
					{false, true, true, true, true, true, true, true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false},
		            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
					},
		            
		            {
						
						//Hard Maze
						{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false},
						{false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false},
						{false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false},
						{true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,false,false,false,false,true,true,true,false,true,true,true,false,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,false,false,true,false,false,true,true,true,false,false,false,false,false,true,true,true,false},
						{false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false},
						{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
						},	
		            
	};
		
		public Maze(String s) {
			setCurMaze(s);
		}
	
	private int[][]_plyStartLocations = {{18,17}, {15,14}, {17,42}};
	
	private int[][]_minStartLocations = {{4,11}, {10,10}, {19,39}};
	
	private int[][]_exits = {{0,11}, {0,15}, {37,0}};
	
	private int[][]_swords = {{12,11}, {1,9}, {37,75}};
	
	private int[][]_spiderStartLocations = {{18,16},{15,15},{17,41}};
	
	private int[]_plyStartLocation = {18,17};
	
	private int[]_minStartLocation = {12,11};
	
	private int[]_exit = {23,8};
	
	private int[]_sword = {4,13};
	
	private int[]_spiderStartLocation = {10,22};
	
	public boolean[][] getMaze() { return _curMaze; }
	
	public int[]getPlyStart() { return _plyStartLocation; }
	
	public int[]getMinStart() { return _minStartLocation; }
	
	public int[]getSpiderStart(){return _spiderStartLocation;}
	
	public int[]getExit() { return _exit; }
	
	public int[]getSword() {return _sword; }
	
	public void setCurMaze(String mazeType) {  // Helper method for maze selection.
		
		if(mazeType !=null && mazeType.equalsIgnoreCase("e")) {	
			_curMaze = _mazeList[0];
			_plyStartLocation = _plyStartLocations[0];
			_minStartLocation = _minStartLocations[0];
			_exit = _exits[0];
			_sword = _swords[0];
			_spiderStartLocation = _spiderStartLocations[0];
		}
		
		if(mazeType !=null && mazeType.equalsIgnoreCase("m")) {	
			_curMaze = _mazeList[1];
			_plyStartLocation = _plyStartLocations[1];
			_minStartLocation = _minStartLocations[1];
			_exit = _exits[1];
			_sword = _swords[1];
			_spiderStartLocation = _spiderStartLocations[1];
	    }
		
		if(mazeType !=null && mazeType.equalsIgnoreCase("h")) {	
			_curMaze = _mazeList[2];
			_plyStartLocation = _plyStartLocations[2];
			_minStartLocation = _minStartLocations[2];
			_spiderStartLocation = _spiderStartLocations[2];
			_exit = _exits[2];
			_sword = _swords[2];
        }
  }
	public boolean isAWall(int x, int y) { // Checks for a wall.
		return _curMaze[x][y];
	}
}
